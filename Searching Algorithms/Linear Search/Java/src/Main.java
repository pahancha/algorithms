public class Main {
    public static void main(String[] args) {
        int[] numbers = { 3,6,2,8,0,7,5 };
        LinearSearch search = new LinearSearch();

        int index = search.linearSearch(numbers,7);
        System.out.println(index);
    }
}
