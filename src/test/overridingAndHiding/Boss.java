package test.overridingAndHiding;

public class Boss extends Employee {
    static void sit() {
    }

    void eat() {
        System.out.println("Boss eating");
    }

    public static void main(String[] args) {
        Boss boss = new Boss();
//        boss = null;
        try {
            boss.finalize();
        } catch (Throwable throwable) {
            System.out.println(throwable);
        }
//        System.gc();
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("finalize run");
    }
}
