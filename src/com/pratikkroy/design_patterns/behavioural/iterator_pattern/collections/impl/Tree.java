package com.pratikkroy.design_patterns.behavioural.iterator_pattern.collections.impl;

import com.pratikkroy.design_patterns.behavioural.iterator_pattern.collections.Collection;

public class Tree implements Collection {
    @Override
    public boolean add(final Object obj) {
        
        return true;
    }

    @Override
    public Object get(final int index) {
        return null;
    }

    @Override
    public Object remove(final Object obj) {
        return null;
    }

    @Override
    public boolean contains(final Object obj) {
        return false;
    }

    @Override
    public int getSize() {
        return 0;
    }
}
