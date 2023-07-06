package baseball;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class InputReceiverTest {
    @DisplayName("사용자가 숫자만 입력할 시 정상 처리된다.")
    @Test
    void user_input_test_when_user_type_only_number() {
        // given
        String input = "123";
        this.setSystemIn(input);

        // when
        InputReceiver inputReceiver = new InputReceiver();
        List<Integer> playerInput = inputReceiver.generateThreeNumbers();

        // then
        assertThat(playerInput).containsExactly(1, 2, 3);
    }

    @DisplayName("사용자가 문자가 포함된 숫자 입력할 시 예외를 던진다.")
    @Test
    void user_input_test_when_user_type_with_string() {
        // given
        String input = "1as";
        this.setSystemIn(input);

        // when
        // then
        assertThatThrownBy(() -> {
            InputReceiver inputReceiver = new InputReceiver();
            List<Integer> playerInput = inputReceiver.generateThreeNumbers();
        })
            .isInstanceOf(IllegalArgumentException.class)
            .hasMessage("숫자만 입력해주세요");
    }

    @DisplayName("사용자가 입력한 문자열의 길이가 3보다 길면 예외를 던진다.")
    @Test
    void user_input_test_when_user_type_over_max_length() {
        // given
        String input = "12311";
        this.setSystemIn(input);

        // when
        // then
        assertThatThrownBy(() -> {
            InputReceiver inputReceiver = new InputReceiver();
            List<Integer> playerInput = inputReceiver.generateThreeNumbers();
        })
            .isInstanceOf(IllegalArgumentException.class)
            .hasMessage("세 자리 숫자만 입력해주세요");
    }

    private void setSystemIn(String input) {
        InputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);
    }
}
