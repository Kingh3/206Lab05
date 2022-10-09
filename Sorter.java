import java.util.Arrays;
public class Sorter {
   public static void main(String[] args) {
      System.out.println("hello");
        int[] arr = {2,1,5,4};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
   private static void sort(int[] arr) {
	   selectionSort(arr);

	   
}
   static void selectionSort(int[] arr){

	   

       int n = arr.length;
       // One by one move boundary of unsorted subarray
       for (int i = 0; i < n-1; i++)
       {
           // Find the minimum element in unsorted array
           int min_idx = i;
           for (int j = i+1; j < n; j++)
               if (arr[j] < arr[min_idx])
                   min_idx = j;
           // Swap the found minimum element with the first
           // element
           int temp = arr[min_idx];
           arr[min_idx] = arr[i];
           arr[i] = temp;
       }
   }
    private static void insertionSort(int[] array) {

        int n = array.length;
        for (int j = 1; j < n; j++) {
            int key = array[j];
            int i = j-1;
            while ( (i > -1) && ( array [i] > key ) ) {
                array [i+1] = array [i];
                i--;
            }
            array[i+1] = key;
        }
    }

}