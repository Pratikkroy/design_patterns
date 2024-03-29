package com.pratikkroy.design_patterns.behavioural.iterator_pattern.collections.impl;

import com.pratikkroy.design_patterns.behavioural.iterator_pattern.collections.Collection;
import com.pratikkroy.design_patterns.behavioural.iterator_pattern.collections.Iterable;
import com.pratikkroy.design_patterns.behavioural.iterator_pattern.iterators.Iterator;
import com.pratikkroy.design_patterns.behavioural.iterator_pattern.iterators.impl.ListForwardIterator;

public class List<T> implements Collection<T>, Iterable {

    // can't initialise T type arr, thus using Object
    private final Object[] arr;
    private       int      size;
    private static final int MAX_SIZE = 1000;

    public List() {
        arr = new Object[MAX_SIZE];
        size = 0;
    }

    @Override
    public boolean add(final T obj) {
        if(size>=MAX_SIZE)
            return false;
        arr[size] = obj;
        size++;
        return true;
    }

    @Override
    public T get(final int index) {
        if(index<0 || index>=size)
            return null;
        return (T)arr[index];
    }

    @Override
    public T remove(final T obj) {
        T object = null;
        Iterator<T> listForwardIterator = getIterator();
        int index = 0;
        while(listForwardIterator.hasNext()){
            object = listForwardIterator.getNext();
            if(object.equals(obj)){
                shiftLeft(index);
                break;
            }
            object = null;
            index++;
        }
        arr[size-1] = null;
        size--;
        return object;
    }

    private void shiftLeft(int index) {
        while(index < size-1) {
            arr[index] = arr[index+1];
            index++;
        }
    }

    @Override
    public boolean contains(final T obj) {
        Iterator<T> listForwardIterator = getIterator();
        while(listForwardIterator.hasNext()){
            if(listForwardIterator.getNext().equals(obj)){
                return true;
            }
        }
        return false;
    }

    @Override
    public int getSize() {
        return this.size;
    }

    @Override
    public String toString() {
        String str = "List = [ ";
        Iterator<T> listForwardIterator = getIterator();
        while(listForwardIterator.hasNext()){
            str = str + listForwardIterator.getNext().toString()+ " ";
        }

        return str + " ]";
    }

    @Override
    public Iterator<T> getIterator() {
        return new ListForwardIterator<T>(this);
    }
}
