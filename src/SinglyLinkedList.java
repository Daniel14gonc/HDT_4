public class SinglyLinkedList<E> extends AbstractList<E> {

  private Node<E> head;
  
  public SinglyLinkedList(){
    count = 0;
    head = null;
  }
  
  
  public void add(E value){
    //pre: Crear un nodo temporal y verificar si la cabeza de la lista tiene algun valor
    Node<E> temp = new Node<E>(value, null);
    if(head != null){
      Node<E> finger = head;
      while(finger.next() != null){
        finger = finger.next();
      }
      finger.setNext(temp);
    }else{
      head = temp;
    }
    //post: Agregar el valor y summar a la cuenta
    count++;
  }

  public E getLast(){
    //pre: Crear un nodo igual a la cabeza y otro nulo
    Node<E> finger = head;
    Node<E> previous = null;
    //Assert.pre(head != null, "List is not empty.");
    //post: Recorrer la lista hasta llegar al ultimo elemento y devolverlo.
    while(finger.next() != null){
      previous = finger;
      finger = finger.next();
    }
    if(previous == null){
      return head.value();
    }

    return finger.value();
  }

  public E remove(){
    //PRE: Crear un nodo igual a la cabeza y otro nulo.
    Node<E> finger = head;
    Node<E> previous = null;
    //Assert.pre(head != null, "List is not empty.");
    while(finger.next() != null){
      previous = finger;
      finger = finger.next();
    }
    if(previous == null){
      head = null;
    }else{
      previous.setNext(null);
    }
    //post: encontrar el ultimo elemento y removerlo volviendolo nulo
    count--;

    return finger.value();
  }

  public int size(){
    //pre:Contar la cantidad de elementos que no sean nulos.
    int elementcount = 0;
    Node<E> finger = head;
    while(finger != null){
      elementcount++;
      finger = finger.next();
    }
    //post: devolver la cantidad de elementos contados.
    return elementcount;
  }
}
