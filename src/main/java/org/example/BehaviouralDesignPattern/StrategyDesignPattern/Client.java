package org.example.BehaviouralDesignPattern.StrategyDesignPattern;

import org.example.BehaviouralDesignPattern.StrategyDesignPattern.Strategies.BubbleSort;
import org.example.BehaviouralDesignPattern.StrategyDesignPattern.Strategies.InsertionSort;
import org.example.BehaviouralDesignPattern.StrategyDesignPattern.Strategies.MergeSort;
import org.example.BehaviouralDesignPattern.StrategyDesignPattern.Strategies.SortingAlgorithm;

public class Client {
    public static void main(String[] args){
        int[] arr={1,2,3};
        SortingAlgorithm sortingAlgorithm=new BubbleSort();
        SortingContext sortingContext=new SortingContext(sortingAlgorithm);
        sortingContext.performSort(arr);
        sortingContext.setSortingAlgorithm(new InsertionSort());
        sortingContext.performSort(arr);
        sortingContext.setSortingAlgorithm(new MergeSort());
        sortingContext.performSort(arr);
    }
}
