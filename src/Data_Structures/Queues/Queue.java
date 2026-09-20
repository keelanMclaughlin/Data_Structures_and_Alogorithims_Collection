package Data_Structures.Queues;

public interface Queue<T> {
    void enqueue(T x);
    T dequeue();
    T next();
    boolean empty();
}
