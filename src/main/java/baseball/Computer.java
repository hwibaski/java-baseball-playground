package baseball;

import static baseball.BallSet.TOTAL_BALL_COUNT;

import java.util.ArrayList;
import java.util.List;

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
        List<Integer> prevNums = new ArrayList<>();
        int madeBallCount = 0;
        while (madeBallCount < TOTAL_BALL_COUNT) {
            int randomNumber = RandomNumberGenerator.createRandomNumberBetweenOneAndNine();
            int order = madeBallCount + 1;
            Ball ball = new Ball(randomNumber, order);
            madeBallCount = getMadeBallCount(tmpBalls, prevNums, madeBallCount, ball);
        }
    }

    private int getMadeBallCount(Ball[] tmpBalls, List<Integer> prevNums, int madeBallCount, Ball ball) {
        if (!prevNums.contains(ball.getNum())) {
            tmpBalls[madeBallCount] = ball;
            madeBallCount++;
            prevNums.add(ball.getNum());
        }
        return madeBallCount;
    }

    /**
     * 테스트 위한 getter 개방
     */
    public BallSet getBallSet() {
        return ballSet;
    }
}
