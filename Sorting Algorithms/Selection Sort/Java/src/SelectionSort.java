public class SelectionSort {
    public static void main(String[] args) {

        int [] arr = {4,5,7,2,4,7,1,9,7};

        System.out.println("Array before getting sorted: ");
        printArray(arr);

        System.out.println("\nArray after getting sorted: ");
        printArray(selectionSort(arr));
    }

    private static int[] selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++){
            int minIndex = i;
            for (int j = i; j < arr.length; j++){
                if (arr[j] < arr[minIndex]){
                    minIndex = j;
                }
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }
        }

        return arr;
    }

    private static void printArray(int[] arr) {
        for (int i = 0; i <= arr.length - 1; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
