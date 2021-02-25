/**
 * @author Daniel Gonzalez 20293, Alejandro Archila 161250
 * Modificacion: 02/21/2021
 * Clase: StackList
 *
 * Descripcion:
 *  Clase que permite implementar las acciones de un stack para el
 *  almacenamiento y manejo de datos por medio de una lista.
 */


public class StackList<T> extends AbstractStack<T> {
  private List<T> lista;

  public StackList(List<T> lista){
    this.lista = lista;
  }
  
  public T peek(){
    //Pre: Determinar si el stack esta vacio o no.
    //Post: Retornar el ultimo valor de la lista.
    if(empty()){
      T last = lista.getLast();
      return last;
    }
    else {
      return null;
    }

  }

  public void push(T num){
    //Pre: Validar que el valor ingresado no sea null
    //Post: Ingresar el valor a la lista.
    if(num != null)
      lista.add(num);
  }

  public T pop(){
    //Post: Retornar el ultimo valor de la lista y eliminarlo.
    T last  = lista.remove();
    
    return last;
  }

  public int size(){
    //Post: retornar el tamaño de la lista.
    int size = lista.size();

    return size;
  }

}