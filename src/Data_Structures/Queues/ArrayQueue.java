package Data_Structures.Queues;

public class ArrayQueue implements Queue<Object> {
    private Object[] Q;
    private int head;   // index of front element
    private int tail;    // index after the last element

    public ArrayQueue(int capacity) {
        Q = new Object[capacity];
        head = 0;
        tail = 0;

    }

    public void enqueue(Object x) {
        if (tail == Q.length){
            tail = 1;
        }else{
            Q[tail] = x;
            tail = tail + 1;

        }
    }

    public Object dequeue() {
        Object x = Q[head];
        if (head == Q.length -1){
            head = 1;
        }else{
            head = head + 1;
        }
        return x;

    }

    public Object next() {

        return Q[head++];
    }

    public boolean empty() {
        return head == tail;
    }

    public static void main(String[] args) {
        Queue<Object> test = new ArrayQueue(20);
        System.out.println(test.empty());
        for (int i = 0; i < 10; i++) {
            test.enqueue(i + 100);
        }
        System.out.println(test.empty());
        System.out.println(test.next());
        for (int i = 0; i < 5; i++) {
            int x = (int) test.dequeue();
            System.out.print(x + " ");
        }
        System.out.println();
        for (int i = 0; i < 15; i++) {
            test.enqueue(i);
        }
        while (!test.empty()) {
            int x = (int) test.dequeue();
            System.out.print(x + " ");
        }
        System.out.println();
    }
}
