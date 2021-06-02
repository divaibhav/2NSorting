package selectionsort;

import java.util.Arrays;

public class MySelectionSort {
    public static void main(String[] args) {
        int[] arr = {50,40,30,20,10};
        System.out.println("unsorted --> " + Arrays.toString(arr));
        MySelectionSort obj = new MySelectionSort();
        obj.selectionSort(arr);
        System.out.println("sorted --> " + Arrays.toString(arr));
    }
    public void selectionSort(int[] arr){
        //step 1
        int sortedIndex = arr.length;
        int maximumElement;
        int maximumElementIndex;
        //step2
        for (int i = 0; i < arr.length - 1; i++) {
            //step 3
            maximumElement = arr[0];
            maximumElementIndex = 0;
            //step 4
            for (int j = 0; j < sortedIndex; j++) {
                //step 5
                if(maximumElement < arr[j]){
                    maximumElement = arr[j];
                    maximumElementIndex = j;
                }
            }

            //step 6 swap
            int temp = arr[maximumElementIndex];
            -- sortedIndex;
            arr[maximumElementIndex] = arr[sortedIndex];
            arr[sortedIndex] = temp;

        }
    }
}
