package baseball;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class RandomNumberGeneratorTest {
    @DisplayName("1~9 사이의 랜덤한 수 3개를 리턴한다.")
    @Test
    void generate_random_number_between_one_and_nine() {
        // when
        RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();
        List<Integer> randomNums = randomNumberGenerator.generateThreeNumbers();
        int expectedSize = 3;

        // then
        assertThat(randomNums).allSatisfy(integer -> {
            assertThat(integer).isLessThanOrEqualTo(9);
            assertThat(integer).isGreaterThanOrEqualTo(1);
        });
        assertThat(randomNums).hasSize(expectedSize);
    }
}
