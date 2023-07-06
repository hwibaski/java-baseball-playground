package baseball;

import static baseball.BallSet.TOTAL_BALL_COUNT;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomNumberGenerator {
    public static List<Integer> createRandomNumberBetweenOneAndNine() {
        List<Integer> numbers = new ArrayList<>();

        while (numbers.size() < TOTAL_BALL_COUNT) {
            int randomNumber = createRandomNumber();
            addRandomNumberToNumbers(numbers, randomNumber);
        }

        return numbers;
    }

    private static void addRandomNumberToNumbers(List<Integer> numbers, int randomNumber) {
        if (isNotContains(numbers, randomNumber)) {
            numbers.add(randomNumber);
        }
    }

    private static boolean isNotContains(List<Integer> numbers, int randomNumber) {
        return !numbers.contains(randomNumber);
    }

    public static int createRandomNumber() {
        return new Random().nextInt(9) + 1;
    }
}
