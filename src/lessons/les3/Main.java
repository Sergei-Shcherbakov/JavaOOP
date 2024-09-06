package lessons.les3;

public class Main {
    public static void main(String[] args) {
        Foo foo2 = new Foo() {
            @Override
            public void m1() {
                System.out.println(">>>m1");
            }

            @Override
            public void m2() {
                System.out.println(">>>m2");
            }
        };
        foo2.m1();
    }
}
