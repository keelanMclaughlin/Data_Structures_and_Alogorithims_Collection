package Data_Structures.Lists;

public class DoubleLinkedList implements List<Object> {

    private class ListNode {
        public ListNode(Object x) {
            key = x;
        }
        public Object key;
        public ListNode prev = null;
        public ListNode next = null;
    }
    private ListNode head;
    private ListNode tail;

    public DoubleLinkedList()
    {
        // TASK 1.
        head = null;
        tail = null;
    }

    public void prepend(Object x) {
        // TASK 1.B

        ListNode inputNode = new ListNode(x);
        if (head == null) {
            head = inputNode;
            tail = inputNode;
        } else {
            head.prev = inputNode;
            inputNode.next = head;
            head = inputNode;
        }
    }
    public Object getFirst() {
            // TASK 1.C
            if (head == null) {
                System.out.println("list is empty");
            }

                return head.key;
        }
    public void deleteFirst() {
        // TASK 1.D
        if (head == null) {
            System.out.println("list is empty");
        }
        else{
            head = head.next;
            if (head != null){
                head.prev = null;
            }
            else {
                tail = null;
            }
        }

    }

    public void append(Object x) {
        // TASK 1.E
        ListNode inputNode = new ListNode(x);
        if (tail == null) {
            head = inputNode;
            tail = inputNode;
        } else {
            tail.prev = inputNode;
            inputNode.next = tail;
            tail = inputNode;
        }
    }

    public Object getLast() {
        // TASK 1.F
        if (tail == null) {
            System.out.println("list is empty");
        }
            return tail.key;
    }

    public void deleteLast() {
        // TASK 1.G
        if (tail == null) {
            System.out.println("list is empty");
        }
        else{
            tail = tail.next;
            if (tail != null){
                tail.prev = null;
            }
            else {
                head = null;
            }
        }
    }

    public boolean empty() {
        // TASK 1.H
        if (head == null) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        List<Object> test = new DoubleLinkedList();
        System.out.println(test.empty());
        for (int i=0; i<10; i++) {
            test.prepend(i + 100);
        }
        System.out.println(test.empty());
        for (int i=0; i<5; i++) {
            int x = (int)test.getFirst();
            System.out.print(x + " ");
            test.deleteFirst();
        }
        System.out.println();
        for (int i=0; i<10; i++) {
            test.append(i + 200);
        }
        while (!test.empty()) {
            int x = (int)test.getLast();
            System.out.print(x + " ");
            test.deleteLast();
        }
    }
}
