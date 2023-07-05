package baseball;

import static baseball.BallSet.TOTAL_BALL_COUNT;

import java.util.Arrays;

public class Referee {
    private int strikeCount;
    private int ballCount;

    public void judge(BallSet prevBallSet, BallSet nextBallSet) {
        judgeStrike(prevBallSet, nextBallSet);
    }

    public int judgeStrike(BallSet prevBallSet, BallSet nextBallSet) {
        for (int i = 0; i < TOTAL_BALL_COUNT; i++) {
            this.increaseStrikeCount(prevBallSet.getBalls()[i].getNum(), nextBallSet.getBalls()[i].getNum());
        }

        return this.strikeCount;
    }

    private void increaseStrikeCount(int prevBallNum, int nextBallNum) {
        if (prevBallNum == nextBallNum) {
            this.strikeCount++;
        }
    }

    public int judgeBall(BallSet prevBallSet, BallSet nextBallSet) {
        for (int i = 0; i < TOTAL_BALL_COUNT; i++) {
            long ballCountWithEachBall = this.calculateBallCountInNextBallSetWithPrevBall(prevBallSet.getBalls()[i],
                nextBallSet);
            this.ballCount += ballCountWithEachBall;
        }

        return this.ballCount;
    }

    private int calculateBallCountInNextBallSetWithPrevBall(Ball prevBall, BallSet nextBallSet) {
        return (int)Arrays.stream(nextBallSet.getBalls())
            .filter((ball) -> ball.getOrder() != prevBall.getOrder())
            .filter(ball -> ball.getNum() == prevBall.getNum()).count();
    }
}
