package baseball;

public class Ball {
    private int num;

    public Ball(int num) {
        validateBallNumThatBetweenOneAndNine(num);
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    private void validateBallNumThatBetweenOneAndNine(int num) {
        if (num < 1 || num > 9) {
            throw new IllegalArgumentException("볼은 1에서 9사이의 값만 가질 수 있습니다");
        }
    }
}
