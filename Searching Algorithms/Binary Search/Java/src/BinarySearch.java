public class BinarySearch {
    // binary search can be implemented using recursion and iteration. Implementation for recurssion is below.

    //Recursive Implementation
    public int binarySearchRec(int[] array, int target, int left, int right) {
        int middle = (left + right) / 2;

        if (array[middle] == target) {
            return middle;
        }

        if (right < left){
            return -1;
        }

        if (target < array[middle]) {
            return binarySearchRec(array, target, left, middle - 1);
        }

        return binarySearchRec(array, target, middle + 1, right);
    }
}
