package lambas;

import java.util.Comparator;

public class ComparatorLambdaExample {
    public static void main(String[] args) {
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2); // 0 -> o1 == o2
                                         // 1 -> o1 > o2
                                         // -1 -> o1 < o2
            }
        };

        System.out.println("Result of comparator is: " + comparator.compare(2, 2));

        Comparator<Integer> comparator1 = (Integer a, Integer b) -> a.compareTo(b);

        System.out.println("Result of comparator using lambda is: " + comparator1.compare(3, 2));

        Comparator<Integer> comparator2 = (a, b) -> a.compareTo(b);

        System.out.println("Result of comparator using lambda is: " + comparator2.compare(2, 3));

    }
}
