public class Sorts {

    public static void swap(int[] arr,int a,int b){
        // Swap two elements in an array
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static int partition(int[] arr,int l, int r){
        // used in quick sort
        int pivot = arr[r];
        int i = l - 1;
        for(int j=l;j<r;j++){
            if(arr[j] < pivot){
                i+=1;
                // Note that using swap() here causes a stack overflow error.
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // Move pivot
        int temp = arr[i + 1];
        arr[i + 1] = arr[r];
        arr[r] = temp;
        return i + 1;
    }

    public static void quickSort(int[] arr){
        qs(arr, 0, arr.length - 1);
    }

    public static void qs(int[] arr, int l, int r){
        if (l >= r){
            return;
        } 

        int p = partition(arr, l, r);

        qs(arr, l, p - 1);
        qs(arr, p + 1, r);
    }

    public static void selectionSort(int[] arr){
        int indexMin=0;
        for(int i=0;i<arr.length;i++){
            //Find index of smallest entry in arr[i...n-1]
            indexMin = i;
            for(int j=i+1;j< arr.length;j++){
                if(arr[j] < arr[indexMin]){
                    indexMin = j;
                }
            }
            swap(arr,i,indexMin);
        }
    }

    public static void bubbleSort(int[] arr){
        for(int j=0;j<arr.length;j++){ //Repeat until no swaps needed
            for(int i=0;i<arr.length;i++){
                if(arr[i+1] < arr[i]){ //If neighbouring elements out of order, swap them
                    swap(arr, i+1, i);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11, 30};

        System.out.println("Initial array: ");
        for(int x:arr) System.out.print(x + " ");

        System.out.println();
        quickSort(arr);

        System.out.println("Resulting array: ");
        for(int x:arr) System.out.print(x + " ");
    }
}
