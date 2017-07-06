package BehavioralPatterns.Strategy;

import java.util.Arrays;

class InsertingSort implements Sorting{

    @Override
    public void sort(int[] arr) {
        System.out.println("Inserting sorting");
        System.out.println("before: " + Arrays.toString(arr));
        for (int barier = 1; barier < arr.length; barier++) {
            int index = barier;
            while (index -1 >= 0 && arr[index] < arr[index - 1]) {
                int tmp = arr[index];
                arr[index] = arr[index - 1];
                arr[index - 1] = tmp;
                index--;
            }
        }
        System.out.println("after:\t" + Arrays.toString(arr) + "\n=========================");
    }
}
