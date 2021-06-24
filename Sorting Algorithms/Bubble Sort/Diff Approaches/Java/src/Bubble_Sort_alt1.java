public class Bubble_Sort_alt1 {
    public static void main(String[] args) {

        int [] arr = {4,5,7,2,4,7,1,9,7};

        System.out.println("Array before getting sorted: ");
        printArr(arr);

        System.out.println("\nArray after getting sorted: ");
        printArr(bubbleSort(arr));

    }

    private static int[] bubbleSort(int[] arr) {
        boolean swap = false;
        while (!swap){
            swap = true;
            for(int i = 1; i <= arr.length - 1; i++){
                if(arr[i-1] > arr[i]){
                    swap = false;
                    int temp = arr[i-1];
                    arr[i-1] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        return arr;
    }

    private static void printArr(int[] arr) {
        for(int i = 0; i <= arr.length - 1; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
