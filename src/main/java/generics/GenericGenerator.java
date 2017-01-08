package generics;

import generics.Coffee.Coffee;
import net.mindview.util.Generator;

public class GenericGenerator<T> implements Generator<T> {
    Class<T> type;

    public GenericGenerator(Class<T> type) {
        this.type = type;
    }

    @Override
    public T next() {
        try {
            return type.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static <T> Generator<T> create(Class<T> type) {
        return new GenericGenerator<T>(type);
    }

    public static void main(String[] args) {
        Generator<Coffee> objectGenerator = new GenericGenerator<>(Coffee.class);
        for (int i = 0; i < 10; i++) {
            System.out.println(objectGenerator.next());
        }
    }
 }
