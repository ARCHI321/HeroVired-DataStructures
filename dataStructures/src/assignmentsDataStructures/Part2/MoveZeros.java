package assignmentsDataStructures.Part2;


public class MoveZeros {

    static void moveZerosToEnd(int arr[], int n) {
        int j = 0, i;

        for (i = 0; i < n; i++) {
            if (arr[i] != 0 && arr[j] == 0) {
                arr = swap(arr, i, j);
            }
            if (arr[j] != 0)
                j += 1;
        }
    }

    static int[] swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return arr;
    }


    static void printArray(int arr[], int n) {
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
    
    public static void main(String[] args)
    {
        int arr[] = { 8, 9, 0, 1, 2, 0, 3 };
        int n = arr.length;

        System.out.print("Original array: ");
        printArray(arr, n);

        moveZerosToEnd(arr, n);

        System.out.print("\nModified array: ");
        printArray(arr, n);

    }
}
