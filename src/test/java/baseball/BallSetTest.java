package baseball;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class BallSetTest {

    @DisplayName("BallSet 클래스 인스턴스 생성시 3개의 Ball을 배열의 형태로 가지고 있다.")
    @Test
    void ball_set_has_three_ball() {
        // given
        Ball[] balls = {new Ball(1, 1), new Ball(2, 2), new Ball(3, 3)};
        BallSet ballSet = new BallSet(balls);

        // when
        int ballsLength = ballSet.getBallsLength();

        // then
        assertThat(ballsLength).isEqualTo(3);
    }

}
