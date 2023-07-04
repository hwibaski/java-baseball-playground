package baseball;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class RandomNumberGeneratorTest {
    @DisplayName("1~9 사이의 랜덤한 수를 리턴한다.")
    @Test
    void generate_random_number_between_one_and_nine() {
        // when
        int randomNum = RandomNumberGenerator.createRandomNumberBetweenOneAndNine();

        // then
        assertThat(randomNum).isGreaterThanOrEqualTo(1);
        assertThat(randomNum).isLessThanOrEqualTo(9);
    }
}
