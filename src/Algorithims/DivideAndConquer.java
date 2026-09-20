package Algorithims;

public class DivideAndConquer {
    private int middle;

    public static int fibonacci(int n) {
        // TASK 1.A.a
        if (n == 0){ return 0;}
        else if (n == 1){
            return 1;}
        else{
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }

    public static int search(int[] A, int v)
    {
        // TASK 1.A.b
        int n = A.length;
        int middle = n/2;

        if (n == 1){
            return A[0];
        }else{
            if (A[middle] < v){
                int[] left = new int[middle];

                for (int i = 0; i < middle;i++ ){
                    left[i] = A[i];
                }
                return search(left, v);
            }else{
                int[] right = new int[n - middle];
                for (int i = 0; middle > right.length;i++ ){
                    right[i] = A[middle + i];
                }
                return search(right, v);
            }
        }
    }

    public static void hanoi(int n, char A, char B, char C)
    {

        if (n == 1) {
            System.out.println(A + " -> " + C);
            return;
        }
        hanoi(n - 1, A, C, B);
        System.out.println(A + " -> " + C);
        hanoi(n - 1, B, A, C);

    }

    public static void main(String[] args) {
        for (int i=0; i<10; i++) {
            System.out.println(fibonacci(i));
        }
        System.out.println();
        for (int i=0; i<10; i++) {
            System.out.println(search(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, i));
        }
        System.out.println();
        hanoi(3, 'A', 'B', 'C');
    }
}
