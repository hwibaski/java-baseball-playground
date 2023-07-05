package baseball;

public class BallSet {
    public static final int TOTAL_BALL_COUNT = 3;
    private final Ball[] balls;

    public BallSet(Ball[] balls) {
        this.balls = balls;
    }

    public Ball[] getBalls() {
        return balls;
    }

    /**
     * 테스트 위한 메서드
     */

    public int getBallsLength() {
        return this.balls.length;
    }

}
