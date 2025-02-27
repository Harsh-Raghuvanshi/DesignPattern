package org.example.IterativeDesignPattern.Aggregators;

import org.example.IterativeDesignPattern.Iterators.Iterator;

public interface Aggregator<T> {
    Iterator<T> iterator();
}
