package baseball;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ComputerTest {
    @DisplayName("Computer는 생성 시 BallSet을 가진다.")
    @Test
    void computer_has_ball_set_when_init() {
        // given
        // when
        Computer computer = new Computer();

        // then
        assertThat(computer.getBallSet()).isNotNull();
    }
}
