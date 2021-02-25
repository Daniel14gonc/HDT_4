/**@author Manuel Archila 161250, Daniel Gonzalez 20293
* Modificacion: 02/21/2021
* Interfaz: List
*
* Descripcion:
*  Interfaz que permite crear el contrato para los metodos necesarios
*  para crear un stack basado en listas.
*/


public interface List<E> {
  
  /**Metodo que permite obtener la cantidad de nodos en la lista.*/
  public int size();
  
  /**Metodo que permite determinar si la lista esta vacia o no.*/
  public boolean isEmpty();

  /**Metodo que permite agregar un nuevo nodo a la lista*/
  public void add(E value);

  /**Metodo que permite obtener el ultimo valor de la lista*/
  public E getLast();

  /**Metodo que permite eliminar el ultimo nodo de la lista*/
  public E remove();

}