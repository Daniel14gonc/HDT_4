/**@author Manuel Archila 161250, Daniel Gonzalez 20293
* Modificacion: 02/21/2021
* Clase: AbstractList
*
* Descripcion:
*  Clase que permite utilizar polimorfismo para utilizar el factory para las listas
*  e implementarlas en el stack. Ademas permite generalizar los metodos de isEmpty y size.
*/



public abstract class AbstractList<E> implements List<E> {

  protected int count;

  /**Metodo que permite determinar si la lista esta vacia o no.*/
  public boolean isEmpty(){
    //Post: Retornar un booleano que determine si la lista esta o no vacia.
    return size() == 0;
  }

  /**Metodo que permite saber el tamaño de la lista.*/
  public int size(){
    //Post: Retornar el tamaño de la lista.
    return count;
  }
}