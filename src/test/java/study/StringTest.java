package study;

import java.util.Arrays;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class StringTest {
    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    @Test
    void split() {
        String s = "1,2";

        String[] splitArray = s.split(",");

        assertThat(splitArray).contains("1");
        assertThat(splitArray).contains("2");
        assertThat(splitArray).containsExactly("1", "2");
    }

    @Test
    void substring() {
        String actual = "(1,2)".substring(1,4);

        assertThat(actual).isEqualTo("1,2");
    }

    @Test
    @DisplayName("String charAt() 메소드 작동 테스트")
    void charAt() {
        char actual = "abc".charAt(0);
        assertThat(actual).isEqualTo('a');
        assertThatThrownBy(() -> {
            "abc".charAt(3);
        }).isInstanceOf(IndexOutOfBoundsException.class).hasMessageContaining("String index out of range: 3");
    }
}
