package org.example.BehaviouralDesignPattern.StrategyDesignPattern.Strategies;

public class BubbleSort implements SortingAlgorithm {
    @Override
    public void sort(int[] arr) {
        System.out.println("Sorting array with Bubble Sort");
    }
}
