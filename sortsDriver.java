public class sortsDriver{
    public static void main(String[] args) {
        int[] arr = {2, 2, 0, 6, 1, 9, 9, 7};
        System.out.println("Initial array: ");
        for(int x:arr) System.out.print(x + " ");

        System.out.println();
        Sorts.countingSort(arr);

        System.out.println("Resulting array: ");
        for(int x:arr) System.out.print(x + " ");
    }
}