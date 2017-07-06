package BehavioralPatterns.Strategy;

public class StrategyApp {
    public static void main(String[] args) {
        StrategyClient strategyClient = new StrategyClient();

        int[]arr0 = {1, 3, 2, 1};
        strategyClient.setStrategy(new SelectionSort());
        strategyClient.executeStrategy(arr0);

        int[]arr1 = {11, 4, 2, 7, 8, 54};
        strategyClient.setStrategy(new InsertingSort());
        strategyClient.executeStrategy(arr1);

        int[]arr2  = {3, -8, 2, 0, 33, 1, 3, 2};
        strategyClient.setStrategy(new BubbleSort());
        strategyClient.executeStrategy(arr2);
    }
}
