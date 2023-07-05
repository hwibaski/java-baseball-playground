package baseball;

import static baseball.BallSet.TOTAL_BALL_COUNT;

public class Referee {
    private int strikeCount;

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
}
