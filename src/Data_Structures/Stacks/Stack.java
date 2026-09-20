package Data_Structures.Stacks;

public interface Stack<T> {
    void push(T x);
    T pop();
    T peek();
    boolean empty();
}
