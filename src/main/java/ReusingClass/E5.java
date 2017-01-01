package ReusingClass;

/**
 * Created by hliang on 09/12/2016.
 */
public class E5 {
}

class A {
    A (int i) {
        System.out.println("A");
    }
}

class B {
    B (int i) {
        System.out.println("B");
    }
}

class C extends A {
    private B  b = new B(3);

    public C(int i, B b) {
        super(i);
        this.b = b;
    }

    public static void main(String[] args) {
        C c = new C(2,new B(2));
    }
}