/**
 * @author Daniel Gonzalez 20293, Alejandro Archila 161250
 * Modificacion: 02/24/2021
 * Clase: Stack
 *
 * Descripcion:
 *  Contrato que determina que operaciones tiene el ADT de stack.
 */

public interface Stack<T> {

  /**Metodo que permite agregar un elemento al stack*/
  public void push(T num);

  /**Metodo que devuelve y elimina el ultimo elemento ingresado al stack*/
  public T pop();

  /**Metodo que determina si el stack esta vacio o no.*/
  public boolean empty();

  /**Metodo que devuelve el tamaño del stack.*/
  public int size();

  /**Metodo que devuelve el ultimo elemento ingresado al stack sin eliminarlo.*/
  public T peek();
}