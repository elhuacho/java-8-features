package imperativevsdeclarative;

import java.util.stream.IntStream;

public class ImperativeVsDeclarativeExample {
    public static void main(String[] args) {
        /**
         * Imperative
         */
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            sum+=i;
        }

        System.out.println("Sum: " + sum);

        /**
         * Declarative
         */

        int sum1 = IntStream.rangeClosed(0, 100).sum();
        System.out.println("Sum1 :" + sum1);
    }
}
