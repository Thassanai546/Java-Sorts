public class selectionSort {

    public static void selectionSort(int[] arr){

        int indexMin=0;

        for(int i=0;i<arr.length;i++){
            indexMin = i;
            for(int j=i+1;j< arr.length;j++){
                if(arr[j] < arr[indexMin]){
                    indexMin = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[indexMin];
            arr[indexMin] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};

        System.out.println("Initial array: ");
        for(int x:arr) System.out.print(x + " ");

        System.out.println();
        selectionSort(arr);

        System.out.println("Resulting array: ");
        for(int x:arr) System.out.print(x + " ");
    }
}
