package generics.fibonacci;

import java.util.Iterator;

public class IterableFibonacci extends Fibonacci implements Iterable<Integer> {
    int n;

    public IterableFibonacci(int n) {
        this.n = n;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            public boolean hasNext() {
                return n > 0;
            }

            public Integer next() {
                n--;
                return IterableFibonacci.this.next();
            }

            public void remove() {

            }
        };
    }

    public static void main(String[] args) {
        for (int i :
                new IterableFibonacci(18)) {
            System.out.println(i);
        }
    }
}
