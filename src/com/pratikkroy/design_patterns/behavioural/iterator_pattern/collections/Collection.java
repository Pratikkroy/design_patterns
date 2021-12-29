package com.pratikkroy.design_patterns.behavioural.iterator_pattern.collections;

public interface Collection<T>  {
    public boolean add(T obj);

    public T get(int index);

    public T remove(T obj);

    public boolean contains(T obj);

    public int getSize();
}
