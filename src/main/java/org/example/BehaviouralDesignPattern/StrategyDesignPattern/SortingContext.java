package org.example.BehaviouralDesignPattern.StrategyDesignPattern;

import org.example.BehaviouralDesignPattern.StrategyDesignPattern.Strategies.SortingAlgorithm;

public class SortingContext {
    SortingAlgorithm sortingAlgorithm;

    public SortingContext(SortingAlgorithm sortingAlgorithm) {
        this.sortingAlgorithm = sortingAlgorithm;
    }

    public void setSortingAlgorithm(SortingAlgorithm sortingAlgorithm) {
        this.sortingAlgorithm = sortingAlgorithm;
    }

    public void performSort(int[] arr){
        sortingAlgorithm.sort(arr);
    }

}
