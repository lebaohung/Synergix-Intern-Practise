package test.defaultMethod;

public class Pig implements Mammal, ZAnimal {
    @Override
    public void run() {
        System.out.println("Pig running");
    }

    @Override
    public void eat() {
        System.out.println("Pig eating");
    }

//    @Override
//    public void sleep() {
//        System.out.println("Pig sleeping");
//    }

    public static void main(String[] args) {
        Pig pig = new Pig();
        pig.eat();
        pig.run();
        pig.sleep();
    }
}
