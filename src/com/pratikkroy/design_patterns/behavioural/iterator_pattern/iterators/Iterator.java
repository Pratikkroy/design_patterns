package com.pratikkroy.design_patterns.behavioural.iterator_pattern.iterators;

public interface Iterator<T> {
    public T getNext();

    public boolean hasNext();
}
