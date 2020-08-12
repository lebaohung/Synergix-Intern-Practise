package test.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<Person>();

        Person p1 = new Person(24, "A");
        Person p2 = new Person(12, "B");
        Person p3 = new Person(30, "C");
        list.add(p1);
        list.add(p2);
        list.add(p3);

        Iterator<Person> i = list.iterator();
        while (i.hasNext()) {
            System.out.print(i.next().getName() + " ");
        }

        Collections.sort(list);
        System.out.println();

        Iterator<Person> i2 = list.iterator();
        while (i2.hasNext()) {
            System.out.print(i2.next().getName() + " ");
        }

    }
}
