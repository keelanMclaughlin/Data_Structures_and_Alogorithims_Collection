package Data_Structures.Trees_and_compresion;

public class HeapOfBinaryTries {
    private BinaryTrie[] A;
    private int heapsize;

    private void heapify(int i)
    {
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int smallest = i;

        if (left < heapsize && A[left].compare(A[smallest])) {
            smallest = left;
        }

        if (right < heapsize && A[right].compare(A[smallest])) {
            smallest = right;
        }

        if (smallest != i) {
            BinaryTrie temp = A[i];
            A[i] = A[smallest];
            A[smallest] = temp;

            heapify(smallest);
        }
    }

    public HeapOfBinaryTries(BinaryTrie[] array)
    {
        this.A = array;
        this.heapsize = array.length;

        for (int i = (heapsize / 2) - 1; i >= 0; i--) {
            heapify(i);

        }
    }


    public BinaryTrie extractMin()
    {
        BinaryTrie min = A[0];
        heapsize--;
        A[0] = A[heapsize];
        heapify(0);
        return min;
    }

    public void insert(BinaryTrie x)
    {
        heapsize++;
        int i = heapsize - 1;


        while (i > 0 && x.compare(A[(i-1)/2])) {
            A[i] = A[(i-1)/2];
            i=(i-1)/2;
        }
        A[i] = x;
    }

    public int size()
    {
        return heapsize;
    }
}
