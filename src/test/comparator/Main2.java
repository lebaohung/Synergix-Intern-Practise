package test.comparator;

import java.lang.reflect.Array;
import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        List<Car> list = new ArrayList<Car>();

        Car car1 = new Car("Bray", 2000);
        Car car2 = new Car("Andy", 1990);
        Car car3 = new Car("Cimon", 1980);
        list.add(car1);
        list.add(car2);
        list.add(car3);

        Iterator<Car> i1 = list.iterator();
        while (i1.hasNext()) {
            System.out.print(i1.next().getName() + ", ");
        }
        System.out.println();

        Comparator<Car> comparator = Comparator.comparing(Car::getName);

        Collections.sort(list, comparator);

        Iterator<Car> i2 = list.iterator();
        while (i2.hasNext()) {
            System.out.print(i2.next().getName() + ", ");
        }
        System.out.println();
    }
}
