package baseball;

import static baseball.BallSet.TOTAL_BALL_COUNT;

public class Computer {
    private final BallSet ballSet;

    public Computer() {
        this.ballSet = new BallSet(this.generateThreeBall());
    }

    private Ball[] generateThreeBall() {
        Ball[] tmpBalls = new Ball[TOTAL_BALL_COUNT];
        this.assignBallSet(tmpBalls);
        return tmpBalls;
    }

    private void assignBallSet(Ball[] tmpBalls) {
        for (int i = 0; i < TOTAL_BALL_COUNT; i++) {
            int randomNumber = RandomNumberGenerator.createRandomNumberBetweenOneAndNine();
            int order = i + 1;
            tmpBalls[i] = new Ball(randomNumber, order);
        }
    }

    /**
     * 테스트 위한 getter 개방
     */
    public BallSet getBallSet() {
        return ballSet;
    }
}
