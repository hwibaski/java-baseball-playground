package baseball;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PlayerTest {
    @DisplayName("Player는 생성 시 BallSet을 가진다.")
    @Test
    void player_has_ball_set_when_init() {
        // given
        // when
        String input = "123";
        this.setSystemIn(input);
        Player player = new Player();

        // then
        assertThat(player.getBallSet()).isNotNull();
    }

    private void setSystemIn(String input) {
        InputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);
    }
}
