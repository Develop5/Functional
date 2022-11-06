package sumofsquaresofprimesfunctional;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Sample {
    public static boolean isPrime(int number) {
        return number > 1 &&
                IntStream.range(2, number)
                .noneMatch(i -> number % i == 0);
    }

    public static double computeSumOfSqrtOfPrimes(int start, int count) {
        // given a start, get all the numbers from the start
        // if the number is prime
        // then compute the sqtr
        // compute for only count number of primes
        // sum the sqtrs

        return Stream.iterate(start, e -> e + 1)
                .filter(Sample::isPrime)
                .mapToDouble(Math::sqrt)
                .limit(count)
                .sum();
    }

    public static void main(String[] args) {
        System.out.println(computeSumOfSqrtOfPrimes(101,51));
    }
}
