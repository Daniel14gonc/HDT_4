/**@author Manuel Archila 161250, Daniel Gonzalez 20293
* Modificacion: 02/21/2021
* Clase: Node
*
* Descripcion:
*  Clase que permite implementar un nodo para ser usado en la lista simplemente encadenada.
*/


public class Node<E> {

  protected E data;
  protected Node<E> nextElement;

  public Node(E value, Node<E> nextElement){
    //Post: Se asigna un valor al nodo y una referencia al siguiente.
    data = value;
    this.nextElement = nextElement;
  }

  public Node(E value){
    //Post: Se crea un nodo con un valor, y una referencia nula a un siguiente nodo.
    this(value, null);
  }

  public Node<E> next(){
    //Post: Se devuelve la referencia al siguiente elemento.
    return nextElement;
  }

  public void setNext(Node<E> next){
    //Post: Se cambia la referencia al siguiente nodo.
    nextElement = next;
  }

  public E value(){
    //Post: Se devuelve el valor del nodo.
    return data;
  }

  public void setValue(E value){
    //Post: Se cambia el valor del nodo.
    data = value;
  }
  
}
