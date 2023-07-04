package baseball;

import java.util.Arrays;

public class BallSet {
    public static final int TOTAL_BALL_COUNT = 3;
    private final Ball[] balls;

    public BallSet() {
        this.balls = this.generateThreeBall();
    }

    /**
     * 테스트 위한 메서드
     */
    public int getBallsLength() {
        return this.balls.length;
    }

    private Ball[] generateThreeBall() {
        Ball[] tmpBalls = new Ball[TOTAL_BALL_COUNT];

        for (int i = 0; i < TOTAL_BALL_COUNT; i++) {
            int randomNumber = RandomNumberGenerator.createRandomNumberBetweenOneAndNine();
            tmpBalls[i] = new Ball(randomNumber);
        }

        return tmpBalls;
    }

    public void printBalls() {
        Arrays.stream(balls).forEach(ball -> System.out.println(ball.getNum()));
    }
}
