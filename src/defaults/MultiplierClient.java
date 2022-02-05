package defaults;

import java.util.Arrays;
import java.util.List;

import static defaults.Multiplier.isEmpty;

public class MultiplierClient {

    public static void main(String[] args) {
        Multiplier multiplier = new MultiplierImpl();
        List<Integer> integerList = Arrays.asList(1,3,5);

        System.out.println("Result is : " + multiplier.multiply(integerList));
        System.out.println("Default method size is : " + multiplier.size(integerList));
        System.out.println("Statuc method isEmpty is : " + isEmpty(integerList));
    }
}
