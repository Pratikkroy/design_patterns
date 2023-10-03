package com.pratikkroy.design_patterns.behavioural.iterator_pattern.client;

import com.pratikkroy.design_patterns.behavioural.iterator_pattern.collections.impl.List;
import com.pratikkroy.design_patterns.behavioural.iterator_pattern.collections.impl.Tree;
import com.pratikkroy.design_patterns.behavioural.iterator_pattern.collections.impl.TreeNode;
import com.pratikkroy.design_patterns.behavioural.iterator_pattern.iterators.Iterator;

public class CollectionsDemo {
    public static void demo() {
        treeDemo();
    }

    public static void listDemo() {
        List<Integer> list = new List<>();
        for(int i=0;i<=10; i++){
            list.add(i*10);
        }

        System.out.println("list size="+list.getSize());
        System.out.println(list);

        Iterator<Integer> listForwardIterator = list.getIterator();
        while(listForwardIterator.hasNext()){
            System.out.println(listForwardIterator.getNext());
        }

        System.out.println(list.contains(20));

        list.remove(40);
        System.out.println(list);
    }

    public static void treeDemo() {
        Tree<Integer> tree = new Tree<>();
        for(int i=1;i<=10; i++){
            tree.add(i*10);
        }

        System.out.println("tree size="+tree.getSize());
        System.out.println(tree);

        System.out.println("Breadth First Iterator .....");
        Iterator<Integer> breadthFirstIterator = tree.getBreadthFirstIterator();
        while(breadthFirstIterator.hasNext()){
            System.out.println(breadthFirstIterator.getNext());
        }

        System.out.println("Depth First Inorder Iterator .....");
        Iterator<Integer> inorderIterator = tree.getDepthFirstInorderIterator();
        while(inorderIterator.hasNext()){
            System.out.println(inorderIterator.getNext());
        }
    }
}
