package java8;

import java.util.Optional;

public class OptionalTest {
    public static void main(String[] args) {
        // NullPointerException
//        Optional<String> nullOptional = Optional.of(null);
        Optional<String> emptyOptional = Optional.ofNullable(null);
        Optional<String> existOptional = Optional.of("This");
        System.out.println("exist:" + existOptional.get());

//        System.out.println("empty" + emptyOptional.get());
        System.out.println("exist:" + existOptional.orElseGet(() -> "Really exist?"));
        System.out.println("empty:" + emptyOptional.orElseGet(() -> "Really not exist!"));
    }
}
