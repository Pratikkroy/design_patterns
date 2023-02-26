package com.pratikkroy.design_patterns.behavioural.iterator_pattern.iterators.impl;

import com.pratikkroy.design_patterns.behavioural.iterator_pattern.collections.impl.Tree;
import com.pratikkroy.design_patterns.behavioural.iterator_pattern.collections.impl.TreeNode;
import com.pratikkroy.design_patterns.behavioural.iterator_pattern.iterators.Iterator;

import java.util.ArrayDeque;

public class TreeBreadthFirstIterator<T> implements Iterator<T> {

    final Tree<T> tree;
    final ArrayDeque<TreeNode<T>> queue;

    public TreeBreadthFirstIterator(final Tree<T> tree) {
        this.tree = tree;
        queue = new ArrayDeque<>();

        if (tree.getRoot() != null) {
            queue.add(tree.getRoot());
        }
    }

    @Override
    public T getNext() {
        final TreeNode<T> node = queue.remove();

        if (node.getLeft()!= null) {
            queue.add(node.getLeft());
        }

        if (node.getRight()!= null) {
            queue.add(node.getRight());
        }

        return node.getData();
    }

    @Override
    public boolean hasNext() {
        return !queue.isEmpty();
    }
}
