package com.pratikkroy.design_patterns.behavioural.iterator_pattern.iterators.impl;

import com.pratikkroy.design_patterns.behavioural.iterator_pattern.collections.impl.Tree;
import com.pratikkroy.design_patterns.behavioural.iterator_pattern.collections.impl.TreeNode;
import com.pratikkroy.design_patterns.behavioural.iterator_pattern.iterators.Iterator;

import java.util.ArrayDeque;

public class TreeNodeBreadthFirstIterator<T> implements Iterator<TreeNode<T>> {

    final Tree<T>                 tree;
    final ArrayDeque<TreeNode<T>> queue;

    public TreeNodeBreadthFirstIterator(final Tree<T> tree) {
        this.tree = tree;
        queue = new ArrayDeque<>();

        if (tree.getRoot() != null) {
            queue.add(tree.getRoot());
        }
    }

    @Override
    public TreeNode<T> getNext() {
        final TreeNode<T> node = queue.remove();

        if (node.getLeft()!= null) {
            queue.add(node.getLeft());
        }

        if (node.getRight()!= null) {
            queue.add(node.getRight());
        }

        return node;
    }

    @Override
    public boolean hasNext() {
        return !queue.isEmpty();
    }
}
