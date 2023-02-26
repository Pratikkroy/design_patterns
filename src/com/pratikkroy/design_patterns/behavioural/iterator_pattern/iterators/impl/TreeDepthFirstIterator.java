package com.pratikkroy.design_patterns.behavioural.iterator_pattern.iterators.impl;

import com.pratikkroy.design_patterns.behavioural.iterator_pattern.collections.impl.Tree;
import com.pratikkroy.design_patterns.behavioural.iterator_pattern.collections.impl.TreeNode;
import com.pratikkroy.design_patterns.behavioural.iterator_pattern.iterators.Iterator;

import java.util.ArrayDeque;

abstract public class TreeDepthFirstIterator<T> implements Iterator<T> {

    final Tree<T> tree;
    final ArrayDeque<TreeNode<T>> stack;

    public TreeDepthFirstIterator(final Tree<T> tree) {
        this.tree = tree;
        stack = new ArrayDeque<>();
    }

    @Override
    public boolean hasNext() {
        return !stack.isEmpty();
    }
}
