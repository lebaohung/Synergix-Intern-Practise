package test.collection;

import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Set extends AbstractSet {

    private ArrayList list;

    public Set() {
        list = new ArrayList();
    }

//    public Set(Collection collection) {
//        list = new ArrayList();
//
//        Iterator iterator = list.iterator();
//    }

    @Override
    public Iterator iterator() {
        return list.iterator();
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public boolean add(Object o) {
        boolean idAdded;
        if (idAdded = !list.contains(o)) {
            list.add(o);
        }
        return idAdded;
    }

    @Override
    public boolean remove(Object o) {
        return list.remove(o);
    }

    @Override
    public void clear() {
        list.clear();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return list.contains(o);
    }
}


