/**@author Manuel Archila 161250, Daniel Gonzalez 20293
 * Modificacion: 02/21/2021
 * Clase: ListFactory
 *
 * Descripcion:
 *  Clase que permite determinar una implementacion de lista indicada por el usuario.
 */

public class ListFactory<T> {

  /**Metodo que permite devolver una lista basada en la implementacion elegida por el usuario*/
  public List<T> getList(int option){
    //Pre: Determinar que implementacion desea el usuario.
    //Post: Retornar la implementacion de la lista indicada por el usuario.
    if(option == 3)
      return new SinglyLinkedList<T>();
    else
      return new DoublyLinkedList<T>();
  }
}
