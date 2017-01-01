package generics;

import java.util.ArrayList;
import java.util.Random;

public class RandomList<T> {
    private ArrayList<T> storage = new ArrayList<>();
    private Random rand = new Random(47);

    public void add(T item) {
        storage.add(item);
    }

    public T select() {
        return storage.get(rand.nextInt(storage.size()));
    }

    public static void main(String[] args) {
        RandomList<String> randomList = new RandomList<>();
        for (String s : "1 2 3 4 5 6 7 8 9".split(" ")) {
            randomList.add(s);
        }
        for (int i = 0; i < 5;i++) {
            System.out.println(randomList.select());
        }
    }
}
