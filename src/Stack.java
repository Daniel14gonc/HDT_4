public interface Stack<T> {

  public void push(T num);

  public T pop();

  public boolean empty();

  public int size();

  public T peek();
}