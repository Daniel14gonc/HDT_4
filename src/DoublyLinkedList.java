/**Daniel Gonzalez 20293
* Modificacion: 02/21/2021
* Clase: DoublyLinkedList
*
* Descripcion:
*  Clase que permite implementar los metodos definidos por la interfaz List 
*  para manejar el almacenamiento de datos de un stack.
*/

public class DoublyLinkedList<E> extends AbstractList<E> {

  private DoublyLinkedNode<E> head;
  private DoublyLinkedNode<E> tail;

  /**Constructor que permite inicializar la cabeza y la cola de la lista*/
  public DoublyLinkedList(){
    head = null;
    tail = null;
    count = 0;
  }
  
  public void add(E value){
    //Pre: Determinar si la lista esta vacia o no, para saber donde colocar el nuevo nodo.
    //Post: Colocar el nuevo nodo al inicio de la lista si esta vacia, sino, al final.

    //Se determina si el nuevo nodo debe ser agregado al inicio de la lista o no.
    DoublyLinkedNode<E> newNode = new DoublyLinkedNode<E>(value);
    if(isEmpty()){
      //Si el nodo debe ser agregado al inicio de la lista, la cabeza y la cola apuntan al mismo nodo.
      //La cabeza no tiene ningun nodo previo y la cola ningun nodo posterior.
      head = newNode;
      tail = head;
      head.setPrevious(null);
      tail.setNext(null);
    }
    else{
      //Si hay mas de un nodo, entonces la cola actual debe apuntar al nuevo nodo y luego este se convierte
      //en la cola.

      tail.setNext(newNode);
      newNode.setPrevious(tail);
      newNode.setNext(null);
      tail = newNode;
    }
    count++;
  }

  public E getLast(){
    //Pre: Validar que la lista no este vacia.
    //Post: Si la lista esta vacia retornar null, sino, retornar el ultimo valor.

    if(!isEmpty()){
      return tail.value();
    }
    else{
      return null;
    }
  }

  public E remove(){
    //Pre: Validar que la lista no este vacia.
    //Post: Si la lista no esta vacia, se devuelve el valor del ultimo nodo y se elimina.
    //      De lo contrario, se devuelve null.

    if(!isEmpty()){
      DoublyLinkedNode<E> temp = tail;
      if(tail == head){
        temp = tail;
      }
      else{
        
        tail = tail.previous();
        tail.setNext(null);
        
      }
      count--;
      return temp.value();
    }
    else{
      return null;
    }
  }
}