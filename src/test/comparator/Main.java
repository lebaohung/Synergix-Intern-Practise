package test.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Car> list = new ArrayList<Car>();

        Car car1 = new Car("A", 2000);
        Car car2 = new Car("B", 1990);
        Car car3 = new Car("C", 1980);
        list.add(car1);
        list.add(car2);
        list.add(car3);

        Iterator<Car> i1 = list.iterator();
        while (i1.hasNext()) {
            System.out.print(i1.next().getName() + ", ");
        }
        System.out.println();

        CarComparator carComparator = new CarComparator();
        Collections.sort(list, carComparator);

        Iterator<Car> i2 = list.iterator();
        while (i2.hasNext()) {
            System.out.print(i2.next().getName() + ", ");
        }

    }
}
