package com.pratikkroy.design_patterns.behavioural.iterator_pattern.client;

import com.pratikkroy.design_patterns.behavioural.iterator_pattern.collections.impl.List;
import com.pratikkroy.design_patterns.behavioural.iterator_pattern.iterators.Iterator;

public class CollectionsDemo {
    public static void demo() {
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
    }
}
