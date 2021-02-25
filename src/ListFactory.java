public class ListFactory<T> {


  public List<T> getList(int option){
    if(option == 3)
      return new SinglyLinkedList<T>();
    else
      return new DoublyLinkedList<T>();
  }
}
