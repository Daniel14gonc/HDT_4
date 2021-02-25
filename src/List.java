/**@author Manuel Archila 161250, Daniel Gonzalez 20293
* Modificacion: 02/21/2021
* Interfaz: List
*
* Descripcion:
*  Interfaz que permite crear el contrato para los metodos necesarios
*  para crear un stack basado en listas.
*/


public interface List<E> {
  
  /**Metodo que permite obtener la cantidad de nodos en la lista.
     */
  public int size();

  /**Metodo que permite determinar si la lista esta vacia o no.
   * Post: Retornar un booleano que determine si la lista esta o no vacia.*/
  public boolean isEmpty();

  /**Metodo que permite agregar un nuevo nodo a la lista
   * Pre: Determinar si la lista esta vacia o no, para saber donde colocar el nuevo nodo.
   * Post: Colocar el nuevo nodo al inicio de la lista si esta vacia, sino, al final.*/
  public void add(E value);

  /**Metodo que permite obtener el ultimo valor de la lista
   * Post: Retornar el tamaño de la lista.*/
  public E getLast();

  /**Metodo que permite eliminar el ultimo nodo de la lista
   * Pre: Validar que la lista no este vacia.
   *     Post: Si la lista no esta vacia, se devuelve el valor del ultimo nodo y se elimina.
   *           De lo contrario, se devuelve null.*/
  public E remove();
}