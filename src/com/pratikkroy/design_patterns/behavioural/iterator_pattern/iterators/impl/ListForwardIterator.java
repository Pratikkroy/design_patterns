package com.pratikkroy.design_patterns.behavioural.iterator_pattern.iterators.impl;

import com.pratikkroy.design_patterns.behavioural.iterator_pattern.collections.impl.List;
import com.pratikkroy.design_patterns.behavioural.iterator_pattern.iterators.Iterator;

public class ListForwardIterator<T> implements Iterator<T> {

    final List<T> list;
    int ptr;

    public ListForwardIterator(final List<T> list) {
        this.list = list;
        this.ptr = -1;
    }

    @Override
    public T getNext() {
        if(ptr>=list.getSize())
            return null;
        return (T)list.get(++ptr);
    }

    @Override
    public boolean hasNext() {
        if(ptr>=list.getSize()-1)
            return false;
        return true;
    }
}
