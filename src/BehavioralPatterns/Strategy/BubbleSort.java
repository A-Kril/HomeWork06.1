package BehavioralPatterns.Strategy;

import java.lang.reflect.Array;
import java.util.Arrays;

class BubbleSort implements Sorting{

    @Override
    public void sort(int[] arr) {
        System.out.println("Bubble sorting");
        System.out.println("before: " + Arrays.toString(arr));
        for (int barier = arr.length - 1; barier >= 0; barier--) {
            for (int i = 0; i < barier; i++) {
                if (arr[i] > arr[i+1]){
                    int tmp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = tmp;
                }
            }
        }
        System.out.println("after:\t" + Arrays.toString(arr) + "\n=========================");
    }
}
