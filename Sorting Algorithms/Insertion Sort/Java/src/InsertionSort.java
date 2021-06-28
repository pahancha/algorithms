public class InsertionSort {
    public static void main(String[] args) {
        int [] arr = {4,5,7,2,4,7,1,9,7};

        System.out.println("Array before getting sorted: ");
        printArray(arr);

        System.out.println("\nArray after getting sorted: ");
        printArray(insertionSort(arr));
    }

    private static int[] insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++){
            int current = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > current){
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current;
        }

        return arr;
    }

    private static void printArray(int[] arr) {
        for (int i = 0; i <= arr.length - 1; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
