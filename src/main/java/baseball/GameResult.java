package baseball;

public class GameResult {
    public static final int STRIKE_OUT_COUNT = 3;
    private final int strikeCount;
    private final int ballCount;
    private final boolean isNothing;

    public boolean isGameOver() {
        return this.strikeCount == STRIKE_OUT_COUNT;
    }

    public GameResult(int strikeCount, int ballCount, boolean isNothing) {
        this.strikeCount = strikeCount;
        this.ballCount = ballCount;
        this.isNothing = isNothing;

        this.printResult();
    }

    private void printResult() {
        if (this.isNothing) {
            System.out.println("nothing");
            return;
        }

        if (ballCount > 0) {
            System.out.print(this.ballCount + " 볼 ");
        }

        if (strikeCount > 0) {
            System.out.print(this.strikeCount + " 스트라이크");
        }

        System.out.println();
    }

    public int getStrikeCount() {
        return strikeCount;
    }

    public int getBallCount() {
        return ballCount;
    }

    public boolean isNothing() {
        return isNothing;
    }
}
