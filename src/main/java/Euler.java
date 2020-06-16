import java.util.stream.IntStream;

public class Euler {

    final static private int START_NUMBER = 1;

    public static int sumOfMultiplesOfThreeAndFive(int upperLimit) {

        return IntStream.range(START_NUMBER, upperLimit)
                .filter(number -> number % 3 == 0 || number % 5 == 0)
                .sum();
    }

}
