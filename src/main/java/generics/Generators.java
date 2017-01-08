package generics;

import generics.Coffee.Coffee;
import generics.Coffee.CoffeeGenerator;
import net.mindview.util.Generator;

import java.util.ArrayList;
import java.util.Collection;

public class Generators {
    public static <T> Collection<T> fill(Collection<T> collection, Generator<T> generator, int n) {
        for (int i = 0; i < n; i++) {
            collection.add(generator.next());
        }
        return collection;
    }

    public static void main(String[] args) {
        Collection<Coffee> coffeeCollection = fill(new ArrayList<Coffee>(), new CoffeeGenerator(), 18);
        coffeeCollection.forEach(System.out::println);
    }
}
