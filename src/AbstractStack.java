/**@author Manuel Archila 161250, Daniel Gonzalez 20293
* Modificacion: 02/21/2021
* Clase: AbstracStack
*
* Descripcion:
*  Clase que permite utilizar polimorfismo para utilizar el factory para las diferentes
*  implementaciones de los stacks. Ademas de generalizar el metodo empty para todas las subclases.
*/

public abstract class AbstractStack<E> implements Stack<E>{

  public boolean empty(){
    //Post: Se devuelve un booleano que determina si el stack esta vacio o no.
    return size() == 0;
  }

}