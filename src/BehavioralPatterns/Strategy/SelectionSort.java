package BehavioralPatterns.Strategy;

import java.util.Arrays;

class SelectionSort implements Sorting{

    @Override
    public void sort(int[] arr) {
        System.out.println("Selection sorting");
        System.out.println("before: " + Arrays.toString(arr));
        for (int barier = 0; barier < arr.length - 1; barier++) {
            for (int i = barier; i < arr.length; i++) {
                if (arr[i] < arr[barier]){
                    int tmp = arr[i];
                    arr[i] = arr[barier];
                    arr[barier] = tmp;
                }
            }
        }
        System.out.println("after:\t" + Arrays.toString(arr) + "\n=========================");
    }
}
