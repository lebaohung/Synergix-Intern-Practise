package test.collection;

import java.util.AbstractList;
import java.util.Arrays;

public class List extends AbstractList {

    private static final int DEFAULT_CAPACITY = 10;
    private int size = 0;
    private Object[] myList;

    public List() {
        myList = new Object[DEFAULT_CAPACITY];
    }

    public void ensureCapacity() {
        int newSize = myList.length * 2;
        try {
            myList = Arrays.copyOf(myList, newSize);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean add(Object o) {
        if (size == myList.length) {
            ensureCapacity();
        }
        try {
            myList[size++] = o;
            return true;
        } catch (Throwable e) {
            e.getMessage();
            return false;
        }
    }

    @Override
    public Object remove(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException("Wrong index for remove");
        Object temp = myList[index];
        myList[index] = null;
        return temp;
    }

    @Override
    public Object set(int index, Object element) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException("Wrong index for set");
        myList[index] = element;
        return element;
    }

    @Override
    public Object get(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException("Wrong index for get");
        return myList[index];
    }

    @Override
    public int size() {
        return myList.length;
    }

    public static void main(String[] args) {
        List list = new List();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list.remove(2));
//        System.out.println(list.get(1));
//        System.out.println(list.set(1, 3));


        for (Object o : list.myList) {
            System.out.print(o + ",");
        }
        System.out.println();
        System.out.println(list.size);

    }
}
