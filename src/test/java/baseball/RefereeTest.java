package baseball;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class RefereeTest {
    @DisplayName("strike 판변 테스트 - 3스트라이크인 경우")
    @Test
    void three_strike_test() {
        // given
        Ball[] balls1 = {new Ball(1), new Ball(2), new Ball(3)};
        BallSet ballSet1 = new BallSet(balls1);

        Ball[] balls2 = {new Ball(1), new Ball(2), new Ball(3)};
        BallSet ballSet2 = new BallSet(balls2);

        int expectStrikeCount = 3;

        // when
        Referee referee = new Referee();
        int strikeCount = referee.judgeStrike(ballSet1, ballSet2);

        // then
        assertThat(strikeCount).isEqualTo(expectStrikeCount);
    }

    @DisplayName("strike 판변 테스트 - 2스트라이크인 경우")
    @Test
    void two_strike_test() {
        // given
        Ball[] balls1 = {new Ball(1), new Ball(2), new Ball(3)};
        BallSet ballSet1 = new BallSet(balls1);

        Ball[] balls2 = {new Ball(1), new Ball(2), new Ball(4)};
        BallSet ballSet2 = new BallSet(balls2);

        int expectStrikeCount = 2;

        // when
        Referee referee = new Referee();
        int strikeCount = referee.judgeStrike(ballSet1, ballSet2);

        // then
        assertThat(strikeCount).isEqualTo(expectStrikeCount);
    }

    @DisplayName("strike 판변 테스트 - 1스트라이크인 경우")
    @Test
    void one_strike_test() {
        // given
        Ball[] balls1 = {new Ball(1), new Ball(2), new Ball(3)};
        BallSet ballSet1 = new BallSet(balls1);

        Ball[] balls2 = {new Ball(1), new Ball(5), new Ball(4)};
        BallSet ballSet2 = new BallSet(balls2);

        int expectStrikeCount = 1;

        // when
        Referee referee = new Referee();
        int strikeCount = referee.judgeStrike(ballSet1, ballSet2);

        // then
        assertThat(strikeCount).isEqualTo(expectStrikeCount);
    }

    @DisplayName("strike 판변 테스트 - 0스트라이크인 경우")
    @Test
    void zero_strike_test() {
        // given
        Ball[] balls1 = {new Ball(1), new Ball(2), new Ball(3)};
        BallSet ballSet1 = new BallSet(balls1);

        Ball[] balls2 = {new Ball(2), new Ball(5), new Ball(4)};
        BallSet ballSet2 = new BallSet(balls2);

        int expectStrikeCount = 0;

        // when
        Referee referee = new Referee();
        int strikeCount = referee.judgeStrike(ballSet1, ballSet2);

        // then
        assertThat(strikeCount).isEqualTo(expectStrikeCount);
    }
}