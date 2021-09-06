import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BinarySearch search = new BinarySearch();

        int[] numbers = { 1,3,5,7,8,9,12,34,35,57,78 };
        int left_index = 0;
        int right_index = numbers.length - 1;

        System.out.print("Enter the target value: ");
        int target = scanner.nextInt();

        int index = search.binarySearchRec(numbers,target,left_index,right_index);
        if (index == -1){
            System.out.println("The target value is not in the array.");
        }else{
            System.out.println("The index of the target value is " + index + " .");
        }
    }
}
