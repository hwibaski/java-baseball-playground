package baseball;

public class Computer {
    private final BallSet ballSet;

    public Computer() {
        this.ballSet = new BallSet();
    }

    /**
     * 테스트 위한 getter 개방
     */
    public BallSet getBallSet() {
        return ballSet;
    }

    public void printBalls() {
        ballSet.printBalls();
    }
}
