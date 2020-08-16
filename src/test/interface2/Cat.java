package test.interface2;


class Cat {

    class A {

    }

    interface B {

    }

    interface C {

    }

    class D <T extends Dog, B, C> {

    }
    public static void main(String[] args){
        int[] array = {1, 5, 3};
        int a;
        try {
            a = array[4];
        } catch (IndexOutOfBoundsException e) {
            System.out.println("IndexOutOfBoundsException");
        } catch (Exception e) {
            System.out.println("Exception");
        }
    }
}
