package baseball;

import static baseball.BallSet.TOTAL_BALL_COUNT;

import java.util.List;

public class Player {
    private final BallSet ballSet;

    public Player() {
        this.ballSet = new BallSet(this.generateThreeBall());
    }

    private Ball[] generateThreeBall() {
        Ball[] tmpBalls = new Ball[TOTAL_BALL_COUNT];
        List<Integer> playerInputNum = InputReceiver.getPlayerInputNum();
        this.assignBallSet(tmpBalls, playerInputNum);
        return tmpBalls;
    }

    private void assignBallSet(Ball[] tmpBalls, List<Integer> numbers) {
        int madeBallCount = 0;
        int order = madeBallCount + 1;

        for (Integer number : numbers) {
            tmpBalls[madeBallCount] = new Ball(number, order);
            madeBallCount++;
        }
    }

    /**
     * 테스트 위한 getter 개방
     */
    public BallSet getBallSet() {
        return ballSet;
    }
}
