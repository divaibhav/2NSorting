package bubblesort;

import java.util.Arrays;

public class MyBubbleSort {
    public static void main(String[] args) {
        int[] arr = {100,50,25,15,10};
        System.out.println("unsorted -->" + Arrays.toString(arr));
        MyBubbleSort obj = new MyBubbleSort();
        obj.bubbleSort(arr);
        System.out.println("sorted -->" + Arrays.toString(arr));
    }
    public void bubbleSort(int[] arr){
        //step 1
        for (int i = 0; i < arr.length; i++) {
            //step 2
            System.out.println("pass = > " + (i+1) + "started");
            for (int j = 0; j < arr.length - 1; j++) {
                //step 3
                if(arr[j] > arr[j+1]){
                    //step 4 swap
                    System.out.println("swapping --> " + arr[j] + " with --> " + arr[j+1]);
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
                else {
                    System.out.println("no swap");
                }
                System.out.println(Arrays.toString(arr));
            }
            System.out.println("pass => " + (i+1) + " ends");
            System.out.println(Arrays.toString(arr));
        }
    }
}
