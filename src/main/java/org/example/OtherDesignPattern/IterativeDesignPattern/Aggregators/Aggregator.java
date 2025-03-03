package org.example.OtherDesignPattern.IterativeDesignPattern.Aggregators;

import org.example.OtherDesignPattern.IterativeDesignPattern.Iterators.Iterator;

public interface Aggregator<T> {
    Iterator<T> iterator();
}
