package imperativevsdeclarative;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ImperativeVsDeclarativeExample1 {
    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(1, 1, 2, 2, 3, 4, 4, 5, 6, 6, 7, 8, 8, 9,10);

        /**
         * Imperative
         */
        List<Integer> uniqueList = new ArrayList<>();
        for (Integer integer : integerList) {
            if (!uniqueList.contains(integer)) {
                uniqueList.add(integer);
            }
        }

        System.out.println("UniqueList: " + uniqueList);

        /**
         * Declarative
         */
        List<Integer> uniqueList1 = integerList.stream().distinct().collect(Collectors.toList());

        System.out.println("UniqueList1: " + uniqueList1);
    }
}
