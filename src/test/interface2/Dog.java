package test.interface2;

public class Dog implements Animal, Mammal {
    @Override
    public void eat() {
        System.out.println("Animal - Dog eating");
    }


}
