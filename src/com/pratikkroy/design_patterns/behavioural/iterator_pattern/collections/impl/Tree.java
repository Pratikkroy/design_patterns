package com.pratikkroy.design_patterns.behavioural.iterator_pattern.collections.impl;

import com.pratikkroy.design_patterns.behavioural.iterator_pattern.collections.Collection;
import com.pratikkroy.design_patterns.behavioural.iterator_pattern.collections.Iterable;
import com.pratikkroy.design_patterns.behavioural.iterator_pattern.iterators.Iterator;
import com.pratikkroy.design_patterns.behavioural.iterator_pattern.iterators.impl.TreeBreadthFirstIterator;
import com.pratikkroy.design_patterns.behavioural.iterator_pattern.iterators.impl.TreeDepthFirstInorderIterator;
import com.pratikkroy.design_patterns.behavioural.iterator_pattern.iterators.impl.TreeNodeBreadthFirstIterator;

public class Tree<T> implements Collection<T>, Iterable {

    private TreeNode<T> root;
    private TreeNode<T> nextAvailableParent;
    private int size;
    private static final int MAX_SIZE = 1000;

    public Tree() {
        size = 0;
    }

    public Tree(final TreeNode<T> root) {
        this.root = root;
        this.nextAvailableParent = root;
        size = 1;
    }

    public TreeNode<T> getRoot() {
        return root;
    }

    @Override
    public boolean add(final T obj) {
        if (obj == null || size >= MAX_SIZE)
            return false;

        if (root == null) {
            root = new TreeNode<>(obj);
            nextAvailableParent = root;
            size++;
            return true;
        }


        final TreeNode<T> newNode = new TreeNode<>(obj);
        if (nextAvailableParent.getLeft() == null) {
            nextAvailableParent.setLeft(newNode);
            size++;
            return true;
        } else if (nextAvailableParent.getRight() == null) {
            nextAvailableParent.setRight(newNode);
            nextAvailableParent = findNextNodeInBreadthFirstSearch(nextAvailableParent);
            size++;
            return true;
        }

        return false;
    }

    public TreeNode<T> findNextNodeInBreadthFirstSearch(final TreeNode<T> node) {
        final Iterator<TreeNode<T>> iterator = getBreadthFirstTreeNodeIterator();
        while (iterator.hasNext()) {
            if (iterator.getNext().equals(node)) {
                return iterator.getNext();
            }
        }
        return null;
    }

    @Override
    public T get(final int index) {
        final Iterator<T> iterator = getBreadthFirstIterator();
        int count = 0;
        while (iterator.hasNext()) {
            final T obj = iterator.getNext();
            if (count == index) {
                return obj;
            }
            count++;
        }
        return null;
    }

    @Override
    public T remove(final T obj) {
        if (obj == null || root == null)
            return null;

        if (this.getRoot().getData().equals(obj)) {
            final T data = this.getRoot().getData();
            root = null;
            return data;
        }

        TreeNode<T> node = findNode(obj);
        if (node == null)
            return null;
        TreeNode<T> parentNode = findParent(node);

        // Todo: Complete the method
        return null;
    }

    public TreeNode<T> findParent(final TreeNode<T> targetNode) {
        TreeNode<T> node = null;
        final Iterator<TreeNode<T>> iterator = getBreadthFirstTreeNodeIterator();
        while (iterator.hasNext()) {
            node = iterator.getNext();

            if (node.getLeft() != null && node.getLeft().equals(targetNode)) {
                return node;
            }
            if (node.getRight() != null && node.getRight().equals(targetNode)) {
                return node;
            }
        }

        return null;
    }

    public TreeNode<T> findNode(final T data) {
        final Iterator<TreeNode<T>> iterator = getBreadthFirstTreeNodeIterator();
        while (iterator.hasNext()) {
            TreeNode<T> node = iterator.getNext();
            if (node.getData().equals(data)) {
                return node;
            }
        }
        return null;
    }

    @Override
    public boolean contains(final T obj) {
        final Iterator<T> iterator = getBreadthFirstIterator();
        while (iterator.hasNext()) {
            if (iterator.getNext().equals(obj)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        String str = "Tree = [ ";
        Iterator<T> iterator = getIterator();
        while(iterator.hasNext()){
            str = str + iterator.getNext().toString()+ " ";
        }

        return str + " ]";
    }

    @Override
    public Iterator<T> getIterator() {
        return new TreeBreadthFirstIterator<>(this);
    }

    public Iterator<T> getBreadthFirstIterator() {
        return new TreeBreadthFirstIterator<>(this);
    }

    public Iterator<T> getDepthFirstInorderIterator() {
        return new TreeDepthFirstInorderIterator<>(this);
    }

    public Iterator<TreeNode<T>> getBreadthFirstTreeNodeIterator() {
        return new TreeNodeBreadthFirstIterator<>(this);
    }
}
