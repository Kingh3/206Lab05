import java.util.Arrays;
public class Sorter {
   public static void main(String[] args) {
      System.out.println("hello");
        int[] arr = {2,1,5,4};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
   private static void sort(int[] arr) {
	   
	   
	   
	   
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