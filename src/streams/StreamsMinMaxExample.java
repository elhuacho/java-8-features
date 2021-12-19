package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsMinMaxExample {

    public static int findMaxValue(List<Integer> integerList) {
        return integerList.stream()
                // x variable holds the max value for each element in the iteration
                .reduce(0, (x,y) -> x>y ? x : y);
    }

    public static Optional<Integer> findMinValue(List<Integer> integerList) {
        return integerList.stream()
                // x variable holds the min value for each element in the iteration
                .reduce((x,y) -> x<y ? x : y);
    }

    public static Optional<Integer> findMaxValueOptional(List<Integer> integerList) {
        return integerList.stream()
                // x variable holds the max value for each element in the iteration
                .reduce((x,y) -> x>y ? x : y);
    }

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(6,7,8,9,10);
//        List<Integer> integerList = new ArrayList<>();
        int maxValue = findMaxValue(integerList);
        Optional<Integer> maxValueOptional = findMaxValueOptional(integerList);
        System.out.println("max value is : " + maxValue);

        System.out.println("optional max is : " + maxValueOptional);

        if (maxValueOptional.isPresent()) {
            System.out.println("max value optional is : " + maxValueOptional.get());
        } else {
            System.out.println("Input list is empty");
        }

        Optional<Integer> minValue = findMinValue(integerList);
        System.out.println("min value : " + minValue);

        if (minValue.isPresent()) {
            System.out.println("the minimum value is : " + minValue.get());
        } else {
            System.out.println("no input is passed");
        }
    }
}
