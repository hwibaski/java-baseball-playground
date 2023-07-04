package baseball;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class BallTest {
    @DisplayName("Ball Class 생성자 테스트 - Ball은 9보다 큰 값을 num으로 설정할 수 없다.")
    @Test
    void ball_class_constructor_max_num_constraint_test() {
        // given
        int ballNum = 100;

        // when
        // then
        assertThatThrownBy(() -> new Ball(ballNum))
            .isInstanceOf(IllegalArgumentException.class)
            .hasMessage("볼은 1에서 9사이의 값만 가질 수 있습니다");
    }

    @DisplayName("Ball Class 생성자 테스트 - Ball은 1보다 작은 값을 num으로 설정할 수 없다.")
    @Test
    void ball_class_constructor_min_num_constarint_test() {
        // given
        int ballNum = 0;

        // when
        // then
        assertThatThrownBy(() -> new Ball(ballNum))
            .isInstanceOf(IllegalArgumentException.class)
            .hasMessage("볼은 1에서 9사이의 값만 가질 수 있습니다");
    }
}
