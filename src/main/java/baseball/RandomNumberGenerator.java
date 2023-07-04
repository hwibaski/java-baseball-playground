package baseball;

import java.util.Random;

public class RandomNumberGenerator {
    public static int createRandomNumberBetweenOneAndNine() {
        return zeroRemover(new Random().nextInt(9));
    }

    private static int zeroRemover(int num) {
        if (num == 0) {
            return 1;
        }

        return num;
    }
}
