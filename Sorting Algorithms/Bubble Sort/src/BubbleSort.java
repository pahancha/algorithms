public class BubbleSort {
    public static void main(String[] args) {

        int [] arr = {4,5,7,2,4,7,1,9,7};

        System.out.println("Array before getting sorted: ");
        printArray(arr);

        System.out.println("\nArray after getting sorted: ");
        printArray(bubbleSort(arr));
    }

    private static int[] bubbleSort(int[] arr) {
        for (int i = 0; i <= arr.length - 1; i++){
            for (int j = 1; j <= arr.length - 1; j++){
                if(arr[j - 1] > arr[j]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
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
