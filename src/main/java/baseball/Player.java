package baseball;

import static baseball.BallSet.TOTAL_BALL_COUNT;

public class Player {
    private final BallSet ballSet;

    public Player() {
        this.ballSet = new BallSet(this.generateThreeBall());
    }

    private Ball[] generateThreeBall() {
        Ball[] tmpBalls = new Ball[TOTAL_BALL_COUNT];
        String playerInputNum = InputReceiver.getPlayerInputNum();
        String s = String.valueOf(playerInputNum);
        assignBallSet(tmpBalls, s);
        return tmpBalls;
    }

    private void assignBallSet(Ball[] tmpBalls, String s) {
        for (int i = 0; i < TOTAL_BALL_COUNT; i++) {
            int order = i + 1;
            tmpBalls[i] = new Ball(Character.getNumericValue(s.charAt(i)), order);
        }
    }

    /**
     * 테스트 위한 getter 개방
     */
    public BallSet getBallSet() {
        return ballSet;
    }
}
