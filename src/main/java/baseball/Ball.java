package baseball;

public class Ball {
    private int order;
    private int num;

    public Ball(int num, int order) {
        validateBallNumThatBetweenOneAndNine(num);
        this.num = num;
        this.order = order;
    }

    public int getNum() {
        return num;
    }

    public int getOrder() {
        return order;
    }

    private void validateBallNumThatBetweenOneAndNine(int num) {
        if (num < 1 || num > 9) {
            throw new IllegalArgumentException("볼은 1에서 9사이의 값만 가질 수 있습니다");
        }
    }
}
