package generics;

public class GenericMethods {
    public <T> void f(T x) {
        System.out.println(x.getClass().getName());
    }

    public static void main(String[] args) {
        GenericMethods genericMethods = new GenericMethods();
        genericMethods.f(1);
        genericMethods.f(1.1);
        genericMethods.f('c');
        genericMethods.f(1.0F);
        genericMethods.f(genericMethods);
        genericMethods.f("");
    }
}
