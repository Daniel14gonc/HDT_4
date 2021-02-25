/**@author Manuel Archila 161250, Daniel Gonzalez 20293
* Modificacion: 02/21/2021
* Clase: Main
*
* Descripcion:
*  Clase que permite interactuar con el usuario, para *  solicitarle el tipo de stack que desea usar y
*  para leer las expresiones a calcular.
*/

import java.util.*;
import java.io.*;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    boolean exit = false;
    int option = 0;
    StackFactory<Integer> stackFactory = new StackFactory<Integer>();
    String datos = "";
    try {
        Scanner entrada = new Scanner(new File("datos.txt"));
        while (entrada.hasNextLine()) {
            datos += entrada.nextLine();
        }
        entrada.close();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    while(!exit){
      try{
        //Se lee el tipo de stack que el usuario desea ingresar y se valida que el input sea correcto.
        System.out.println("Bienvenido a la calculadora.");
        System.out.println("Para su calculadora que tipo de stack desea usar?");
        System.out.println("1. Stack ArrayList");
        System.out.println("2. Stack Vector");
        System.out.println("3. Stack Singly Linked List");
        System.out.println("4. Stack Doubly Linked List");
        option = scan.nextInt();
        if(option > 0 && option <= 4)
        {
          exit = true;
        }
        else
          System.out.println("Ingrese una opcion correcta\n");
      }
      catch(Exception e){
        System.out.println("Ingrese una opcion correcta");
        scan.nextLine();
        System.out.println("");
      }
    }

    Stack<Integer> stack = stackFactory.getStack(option); 
    CalculadoraGeneral calculadora = Calculadora.getCalculadora();
    calculadora.setStack(stack);

    if(calculadora == null)
      System.out.println("Ya existe una instancia de calculadora.");


    try {
          //Identificacion de archivo.
          File file = new File("datos.txt");
          scan = new Scanner(file);
          while(scan.hasNextLine()){
              try {
                  //Lectura de archivo
                  String exp = scan.nextLine();
                  String convertido = Convertidor.infixToPostfix(exp);
                  System.out.print("\nLa expresion " + exp + " dio como resultado-> ");
                  if(!convertido.contains("Expresion Invalida")){
                    //Evaluacion de expresion
                    String res = calculadora.Calculo(convertido);
                    System.out.println(res);
                  }
                  else
                    System.out.println("Expresion invalida");

              } catch (Exception e){
                  System.out.println(e.getMessage());
              }

            }
        }
        catch (FileNotFoundException e){
            System.out.println("No se encontro el archivo");
        }


  }
}