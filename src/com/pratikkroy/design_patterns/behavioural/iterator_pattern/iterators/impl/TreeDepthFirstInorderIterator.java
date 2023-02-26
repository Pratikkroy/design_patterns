package com.pratikkroy.design_patterns.behavioural.iterator_pattern.iterators.impl;

import com.pratikkroy.design_patterns.behavioural.iterator_pattern.collections.impl.Tree;
import com.pratikkroy.design_patterns.behavioural.iterator_pattern.collections.impl.TreeNode;


public class TreeDepthFirstInorderIterator<T> extends TreeDepthFirstIterator<T> {

    public TreeDepthFirstInorderIterator(final Tree<T> tree) {
        super(tree);

        if (tree.getRoot() != null) {
            pushLeftMostTreeLineToStack(tree.getRoot());
        }
    }

    private void pushLeftMostTreeLineToStack(final TreeNode<T> node) {
        TreeNode<T> leftNode = node;
        while (leftNode.getLeft() != null) {
            stack.addFirst(leftNode);
            leftNode = leftNode.getLeft();
        }
        stack.addFirst(leftNode);
    }

    @Override
    public T getNext() {
        final TreeNode<T> node = stack.remove();

        if (node.getRight() != null) {
            pushLeftMostTreeLineToStack(node.getRight());
        }

        return node.getData();
    }


}
