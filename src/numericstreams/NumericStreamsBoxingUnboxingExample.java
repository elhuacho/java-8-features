package numericstreams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumericStreamsBoxingUnboxingExample {

    /**
     * Boxing: Convert primitive type to wrapper class type
     */
    public static List<Integer> boxing() {
        return IntStream.rangeClosed(1,10)
                // int
                .boxed()
                //Integer
                .collect(Collectors.toList());
    }

    /**
     * Unboxing: Convert wrapper class type to primitive type
     */
    public static int unBoxing(List<Integer> integerList) {
            // wrapper to primitive
        return integerList.stream()
                // wrapper integer values
                .mapToInt(Integer::intValue)
                .sum();
    }

    public static void main(String[] args) {
        System.out.println("Boxing : " + boxing());

        List<Integer> integerList = boxing();
        System.out.println("Unboxing : " + unBoxing(integerList));
    }
}
