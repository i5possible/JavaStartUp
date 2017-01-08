package generics.fibonacci;

import java.util.Iterator;

public class IterableFibonacciAggregate implements Iterable<Integer> {
    Fibonacci fibonacci;
    int n;

    public IterableFibonacciAggregate(int n) {
        this.n = n;
        fibonacci = new Fibonacci();
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            public boolean hasNext() {
                return n > 0;
            }
            public Integer next() {
                n--;
                return fibonacci.next();
            }
        };
    }

    public static void main(String[] args) {
        for (int i : new IterableFibonacciAggregate(18)) {
            System.out.println(i);
        }
    }
}
