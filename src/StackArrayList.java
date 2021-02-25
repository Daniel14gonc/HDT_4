/**
 * @author Alejandro Archila 161250
 * Modificacion: 02/24/2021
 * Clase: StackArrayList
 *
 * Descripcion:
 *  Clase que permite implementar las acciones de un stack para el
 *  almacenamiento y manejo de datos por medio de un arraylist.
 */

import java.util.ArrayList;
public class StackArrayList<T> extends AbstractStack<T>{

  private ArrayList<T> stack;

  //Constructor para el StackArrayList
  public StackArrayList(){
    stack = new ArrayList<T>();
  }

  //Metodo que recibe un generico para agregarlo al Stack.
  public void push(T num){
    stack.add(num);
  }

  //Metodo que obtiene el elemento final, lo remueve del stack y lo devuelve.
  public T pop(){
    //Pre: Determina si el stack esta vacio.
    //Post: Devuelve y elimina el ultimo valor del stack o regresa null si esta vacio.
    if(!empty()){
      T last = stack.get(stack.size() - 1);
      stack.remove(last);
      return last;
    }
    else
      return null;

  }

  //Metodo que devuelve la cantidad del elementos en el Stack
  public int size(){
    //Post: retornar el tamaño de la lista.
    int size = stack.size();
    return size;

  }

  //Metodo que muestra cual es el ultimo elemento en el Stack.
  public T peek(){
    //Pre: Determinar si el stack esta vacio o no.
    //Post: Retornar el ultimo valor de la lista o null si esta vacio.
    if(!empty()){
      T ojo = stack.get(size()-1);
      return ojo;
    }
    else {
      return null;
    }

  }
}