/**
 * @author Daniel Gonzalez 20293, Alejandro Archila 161250
 * Modificacion: 02/21/2021
 * Clase: StackFactory
 *
 * Descripcion:
 *  Clase que permite usar una implementacion de stack indicada por el usuario.
 */


public class StackFactory<T> {

  private ListFactory<T> listFactory;

  public StackFactory(){
    listFactory = new ListFactory<T>();
  }

  /**Metodo que devuelve un stack dependiendo del tipo deseado.*/
  public Stack<T> getStack(int tipo){
    //Pre: Decide que tipo de stack debe devoler.
    //Post: Devuelve un stack basado en el tipo indicado por el usuario.

    switch(tipo){
      //StackArrayList
      case 1:
        StackArrayList<T> stack1 = new StackArrayList<T>();
        return stack1;

      //StackVector  
      case 2:
        StackVector<T> stack2 = new StackVector<T>();
        return stack2;

      //StackSinglyLinkedList
      case 3:
        List<T> lista1 = listFactory.getList(tipo);
        StackList<T> stack3 = new StackList<T>(lista1);
        return stack3;

      //StackDoublyLinkedList
      case 4:
        List<T> lista2 = listFactory.getList(tipo);
        StackList<T> stack4 = new StackList<T>(lista2);
        return stack4;
        
    }
    
    return null;
  }

  
}