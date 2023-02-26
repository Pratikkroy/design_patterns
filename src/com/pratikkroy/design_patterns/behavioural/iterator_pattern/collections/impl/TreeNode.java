package com.pratikkroy.design_patterns.behavioural.iterator_pattern.collections.impl;

public class TreeNode<T> {

    private final T data;
    private TreeNode<T> left, right;

    public TreeNode(final T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public TreeNode<T> getLeft() {
        return left;
    }

    public TreeNode<T> getRight() {
        return right;
    }

    public void setLeft(final TreeNode<T> left) {
        this.left = left;
    }

    public void setRight(final TreeNode<T> right) {
        this.right = right;
    }

    @Override
    public boolean equals(final Object obj) {
        // since null is not instanceof TreeNode obj != null is covered
        if (!(obj instanceof TreeNode))
            return false;
        final TreeNode<T> node = (TreeNode<T>) obj;
        return this.data.equals(node.getData());
    }
}
