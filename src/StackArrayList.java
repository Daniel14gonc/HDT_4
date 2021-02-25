import java.util.ArrayList;
public class StackArrayList<T> extends AbstractStack<T>{

  private ArrayList<T> stack;

  //Constructor para el StackArrayList
  public StackArrayList(){
    stack = new ArrayList<T>();
  }

  //Metodo que recibe un generico para agregarlo al Stack.
  public void push(T num){
    stack.add(num);
  }

  //Metodo que obtiene el elemento final, lo remueve del stack y lo devuelve.
  public T pop(){
    T last = stack.get(stack.size() - 1);
    stack.remove(last);
    return last;
  }
  //Metodo que verifica si el stack vacio devolvinedo true si esta vacio y false si no esta vacio.
  public boolean empty(){
    boolean stat = stack.isEmpty();
    return stat;
  }
  //Metodo que devuelve la cantidad del elementos en el Stack
  public int size(){
    int size = stack.size();
    return size;

  }

  //Metodo que muestra cual es el ultimo elemento en el Stack.
  public T peek(){
    T ojo = stack.get(size()-1);
    return ojo;
  }
}