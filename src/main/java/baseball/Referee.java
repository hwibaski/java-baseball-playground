package baseball;

import static baseball.BallSet.TOTAL_BALL_COUNT;

import java.util.Arrays;

public class Referee {
    private int strikeCount;
    private int ballCount;

    private boolean isNothing;

    private final BallSet prevBallSet;
    private final BallSet nextBallSet;

    public Referee(BallSet prevBallSet, BallSet nextBallSet) {
        this.prevBallSet = prevBallSet;
        this.nextBallSet = nextBallSet;
    }

    public GameResult judge() {
        this.judgeStrike();
        this.judgeBall();
        this.judgeNothing();

        return new GameResult(this.strikeCount, this.ballCount, this.isNothing);
    }

    private void judgeStrike() {
        for (int i = 0; i < TOTAL_BALL_COUNT; i++) {
            this.increaseStrikeCount(prevBallSet.getBalls()[i].getNum(), nextBallSet.getBalls()[i].getNum());
        }
    }

    private void increaseStrikeCount(int prevBallNum, int nextBallNum) {
        if (prevBallNum == nextBallNum) {
            this.strikeCount++;
        }
    }

    private void judgeBall() {
        for (int i = 0; i < TOTAL_BALL_COUNT; i++) {
            long ballCountWithEachBall = this.calculateBallCountInNextBallSetWithPrevBall(prevBallSet.getBalls()[i],
                nextBallSet);
            this.ballCount += ballCountWithEachBall;
        }
    }

    private int calculateBallCountInNextBallSetWithPrevBall(Ball prevBall, BallSet nextBallSet) {
        return (int)Arrays.stream(nextBallSet.getBalls())
            .filter((ball) -> ball.getOrder() != prevBall.getOrder())
            .filter(ball -> ball.getNum() == prevBall.getNum()).count();
    }

    private void judgeNothing() {
        if (isZeroStrikeCount() && isZeroBallCount()) {
            this.isNothing = true;
        }
    }

    private boolean isZeroStrikeCount() {
        return this.strikeCount == 0;
    }

    private boolean isZeroBallCount() {
        return this.ballCount == 0;
    }
}
