package Algorithims;

public class QuickSort {

    private static int partition(int[] A, int p, int r)
    {
        // TASK 2.B.a
        int partition = A[p];
        int lowindex = p ;
        int highindex = r ;

        while (true){
            while (A[highindex] > partition){
                highindex--;
            }
            while (A[lowindex] < partition){
                lowindex++;
            }
            if (A[lowindex] > A[highindex]){
                int tempvar = A[lowindex];
                A[lowindex] = A[highindex];
                A[highindex] = tempvar;
            }else {
                return highindex;
            }
        }
    }

    private static void quicksort(int[] A, int p, int r)
    {
        // TASK 2.B.b
        if (p < r){
            int q = partition(A,p,r);
            quicksort(A,p,q);
            quicksort(A,q+1,r);
        }
    }

    public static void quicksort(int[] A)
    {
        quicksort(A, 0, A.length-1);
    }

    private static void print(int[] A)
    {
        for (int i=0; i<A.length; i++)
        {
            System.out.print(A[i] + ((i<A.length-1)?", ":""));
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] A = new int[] {5,2,8,1,3,9,7,4,6};
        quicksort(A);
        print(A);
    }

}
