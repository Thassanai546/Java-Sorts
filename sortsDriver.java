public class sortsDriver{
    public static void main(String[] args) {
        int[] arr = {31,16,54,4,2,17,6};
        System.out.println("Initial array: ");
        for(int x:arr) System.out.print(x + " ");

        System.out.println();
        Sorts.insertionSort(arr);

        System.out.println("Resulting array: ");
        for(int x:arr) System.out.print(x + " ");
    }
}