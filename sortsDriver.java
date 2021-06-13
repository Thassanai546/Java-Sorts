public class sortsDriver{
    public static void main(String[] args) {
        int[] arr = {9,8,3,7,5,6,4,1};
        System.out.println("Initial array: ");
        for(int x:arr) System.out.print(x + " ");

        System.out.println();
        Sorts.bubbleSort(arr);

        System.out.println("Resulting array: ");
        for(int x:arr) System.out.print(x + " ");
    }
}