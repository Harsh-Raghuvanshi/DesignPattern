package org.example.BehaviouralDesignPattern.StrategyDesignPattern.Strategies;

public class InsertionSort implements SortingAlgorithm {
    @Override
    public void sort(int[] arr) {
        System.out.println("Sorting array with Insertion Sort");
    }
}
