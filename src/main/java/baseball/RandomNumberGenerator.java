package baseball;

import static baseball.BallSet.TOTAL_BALL_COUNT;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomNumberGenerator implements ThreeNumberGenerator {

    @Override
    public List<Integer> generateThreeNumbers() {
        List<Integer> numbers = new ArrayList<>();

        while (numbers.size() < TOTAL_BALL_COUNT) {
            int randomNumber = this.createRandomNumber();
            this.addRandomNumberToNumbers(numbers, randomNumber);
        }

        return numbers;
    }

    private void addRandomNumberToNumbers(List<Integer> numbers, int randomNumber) {
        if (isNotContains(numbers, randomNumber)) {
            numbers.add(randomNumber);
        }
    }

    private boolean isNotContains(List<Integer> numbers, int randomNumber) {
        return !numbers.contains(randomNumber);
    }

    public int createRandomNumber() {
        return new Random().nextInt(9) + 1;
    }
}
