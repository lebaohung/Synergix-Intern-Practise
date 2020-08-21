package test.collection;

import java.util.AbstractSet;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        AbstractSet list = new HashSet();

        for (Object i:list) {
            System.out.print(i + ", ");
        }
    }
}
