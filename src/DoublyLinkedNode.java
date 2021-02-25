/**@author Daniel Gonzalez 20293
* Modificacion: 02/21/2021
* Clase: DoublyLinkedNode
*
* Descripcion:
*  Clase que permite crear un nodo para la lista doblemente encadenada
*  teniendo una referencia a un nodo siguiente y a uno anterior.
*/


public class DoublyLinkedNode<E> {
  protected E data;
  protected DoublyLinkedNode<E> nextElement;
  protected DoublyLinkedNode<E> previousElement;


  public DoublyLinkedNode(E value, DoublyLinkedNode<E> next, DoublyLinkedNode<E> previous){
    //Pre: Determinar si el siguiente y el anterior nodo son null.
    //Post: Asignar los nodos siguiente y previo, ademas de asignar la referencia propia
    //      a cada uno de estos.

    data = value;
    nextElement = next;
    if(nextElement != null)
      nextElement.setPrevious(this);
    previousElement = previous;
    if(previousElement != null)
      nextElement.setNext(this);
  }

  public DoublyLinkedNode(E v){
    //Post: Utilizar el constructor previo para crear un nuevo nodo con referencias null.
    this(v, null, null);
  }

  public void setNext(DoublyLinkedNode<E> next){
    //Post: Cambia la referencia del siguiente nodo.
    nextElement = next;
  }

  public void setPrevious(DoublyLinkedNode<E> previous){
    //Post: Cambia la referencia del nodo previo.
    previousElement = previous;
  }

  public void setValue(E v){
    //Post: Cambia el valor del nodo.
    data = v;
  }

  public E value(){
    //Post: Se devuelve el valor del nodo.
    return data;
  }

  public DoublyLinkedNode<E> next(){
    //Post: Se devuelve el nodo siguiente.
    return nextElement;
  }

  public DoublyLinkedNode<E> previous(){
    //Post: Se devuelve el nodo anterior.
    return previousElement;
  }
}