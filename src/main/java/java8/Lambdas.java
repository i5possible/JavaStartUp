package java8;

import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class Lambdas {
    public static void main(String[] args) {

        /*
         Function <C , S>
         This function need to use C and return S.
         C is the type to use.
         S is the type to return.
          */
        Function<Long,String> function = Objects::toString;
        Function<Long,String> function1 = aLong -> aLong.toString();

        /*
        Supplier <S>
        This funciton should return a S.
         */
        Supplier<Thread> supplier = () -> Thread.currentThread();
        Supplier<Thread> supplier1 = Thread::new;

        /*
        Consumer<C>
        This function needs a C.
         */
        Consumer<String> c = System.out::println;
        Consumer<String> c1 = (c2) -> System.out.println(c2);


    }
}
