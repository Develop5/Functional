package structured;

import java.util.function.Function;

public class MathExamples {
    public static void print(int number, String message,
                             Function<Integer, Integer> func) {
        System.out.println(" ------------->  " + number + " " + message + ": " + func.apply(number));


    }
    public static void main(String[] args) {
        Function<Integer, Integer> inc = e -> e + 1;
        Function<Integer, Integer> doubleIt = e -> e * 2;

        print(5, "incremented", inc);
        print(5, "doubled", doubleIt);

        Function<Integer, Integer> fused = inc.andThen(doubleIt);
        print(5, "incremented and doubled", fused);

    }
}
