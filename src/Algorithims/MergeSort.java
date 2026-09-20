package Algorithims;

public class MergeSort {

    private static int[] merge(int[] A1, int[] A2)
    {
        // TASK 2.A.a
        int[] merged = new int[A1.length + A2.length];
        int A1Index = 0;
        int A2Index = 0;

        for (int i = 0; i < merged.length; i++) {
            if (A1Index >= A1.length) {
                merged[i] = A2[A2Index++];

            } else if (A2Index >= A2.length) {
                merged[i] = A1[A1Index++];

            } else if (A1[A1Index] <= A2[A2Index]) {
                merged[i] = A1[A1Index++];

            } else {
                merged[i] = A2[A2Index++];
            }
        }
        return merged;

    }


    public static int[] mergesort(int[] A) {
        // TASK 2.A.b
        if (A.length <= 1) return A;

        int middle = A.length / 2;

        int[] left = new int[middle];
        int[] right = new int[A.length - middle];

        for (int i = 0; i < middle; i++) {
            left[i] = A[i];
        }

        for (int i = 0; i < right.length; i++) {
            right[i] = A[middle + i];
        }

        left = mergesort(left);
        right = mergesort(right);

        return merge(left, right);
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
        print(merge(new int[] {1,3,5,7,9}, new int[] {2,4,6,8}));
        print(mergesort(new int[] {5,2,8,1,3,9,7,4,6} ));
    }

}
