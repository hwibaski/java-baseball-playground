package baseball;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class RefereeTest {
    @DisplayName("strike 판변 테스트 - 3스트라이크인 경우")
    @Test
    void three_strike_test() {
        // given
        Ball[] balls1 = {new Ball(1, 1), new Ball(2, 2), new Ball(3, 3)};
        BallSet ballSet1 = new BallSet(balls1);

        Ball[] balls2 = {new Ball(1, 1), new Ball(2, 2), new Ball(3, 3)};
        BallSet ballSet2 = new BallSet(balls2);

        int expectStrikeCount = 3;

        // when
        Referee referee = new Referee(ballSet1, ballSet2);
        GameResult result = referee.judge();

        // then
        assertThat(result.getStrikeCount()).isEqualTo(expectStrikeCount);
    }

    @DisplayName("strike 판변 테스트 - 2스트라이크인 경우")
    @Test
    void two_strike_test() {
        // given
        Ball[] balls1 = {new Ball(1, 1), new Ball(2, 2), new Ball(3, 3)};
        BallSet ballSet1 = new BallSet(balls1);

        Ball[] balls2 = {new Ball(1, 1), new Ball(2, 2), new Ball(4, 3)};
        BallSet ballSet2 = new BallSet(balls2);

        int expectStrikeCount = 2;

        // when
        Referee referee = new Referee(ballSet1, ballSet2);
        GameResult result = referee.judge();

        // then
        assertThat(result.getStrikeCount()).isEqualTo(expectStrikeCount);
    }

    @DisplayName("strike 판변 테스트 - 1스트라이크인 경우")
    @Test
    void one_strike_test() {
        // given
        Ball[] balls1 = {new Ball(1, 1), new Ball(2, 2), new Ball(3, 3)};
        BallSet ballSet1 = new BallSet(balls1);

        Ball[] balls2 = {new Ball(1, 1), new Ball(5, 2), new Ball(4, 3)};
        BallSet ballSet2 = new BallSet(balls2);

        int expectStrikeCount = 1;

        // when
        Referee referee = new Referee(ballSet1, ballSet2);
        GameResult result = referee.judge();

        // then
        assertThat(result.getStrikeCount()).isEqualTo(expectStrikeCount);
    }

    @DisplayName("strike 판변 테스트 - 0스트라이크인 경우")
    @Test
    void zero_strike_test() {
        // given
        Ball[] balls1 = {new Ball(1, 1), new Ball(2, 2), new Ball(3, 3)};
        BallSet ballSet1 = new BallSet(balls1);

        Ball[] balls2 = {new Ball(2, 1), new Ball(5, 2), new Ball(4, 3)};
        BallSet ballSet2 = new BallSet(balls2);

        int expectStrikeCount = 0;

        // when
        Referee referee = new Referee(ballSet1, ballSet2);
        GameResult result = referee.judge();

        // then
        assertThat(result.getStrikeCount()).isEqualTo(expectStrikeCount);
    }

    @DisplayName("ball 판변 테스트 - 0 볼인 경우")
    @Test
    void zero_ball_test() {
        // given
        Ball[] balls1 = {new Ball(1, 1), new Ball(6, 2), new Ball(3, 3)};
        BallSet ballSet1 = new BallSet(balls1);

        Ball[] balls2 = {new Ball(2, 1), new Ball(5, 2), new Ball(4, 3)};
        BallSet ballSet2 = new BallSet(balls2);

        int expectBallCount = 0;

        // when
        // when
        Referee referee = new Referee(ballSet1, ballSet2);
        GameResult result = referee.judge();

        // then
        assertThat(result.getBallCount()).isEqualTo(expectBallCount);
    }

    @DisplayName("ball 판변 테스트 - 1 볼인 경우")
    @Test
    void one_ball_test() {
        // given
        Ball[] balls1 = {new Ball(1, 1), new Ball(2, 2), new Ball(3, 3)};
        BallSet ballSet1 = new BallSet(balls1);

        Ball[] balls2 = {new Ball(2, 1), new Ball(5, 2), new Ball(4, 3)};
        BallSet ballSet2 = new BallSet(balls2);

        int expectBallCount = 1;

        // when
        Referee referee = new Referee(ballSet1, ballSet2);
        GameResult result = referee.judge();

        // then
        assertThat(result.getBallCount()).isEqualTo(expectBallCount);
    }

    @DisplayName("ball 판변 테스트 - 2 볼인 경우")
    @Test
    void two_ball_test() {
        // given
        Ball[] balls1 = {new Ball(5, 1), new Ball(6, 2), new Ball(2, 3)};
        BallSet ballSet1 = new BallSet(balls1);

        Ball[] balls2 = {new Ball(2, 1), new Ball(5, 2), new Ball(4, 3)};
        BallSet ballSet2 = new BallSet(balls2);

        int expectBallCount = 2;

        // when
        Referee referee = new Referee(ballSet1, ballSet2);
        GameResult result = referee.judge();

        // then
        assertThat(result.getBallCount()).isEqualTo(expectBallCount);
    }

    @DisplayName("ball 판변 테스트 - 3 볼인 경우")
    @Test
    void three_ball_test() {
        // given
        Ball[] balls1 = {new Ball(5, 1), new Ball(6, 2), new Ball(2, 3)};
        BallSet ballSet1 = new BallSet(balls1);

        Ball[] balls2 = {new Ball(2, 1), new Ball(5, 2), new Ball(6, 3)};
        BallSet ballSet2 = new BallSet(balls2);

        int expectBallCount = 3;

        // when
        Referee referee = new Referee(ballSet1, ballSet2);
        GameResult result = referee.judge();

        // then
        assertThat(result.getBallCount()).isEqualTo(expectBallCount);
    }

    @DisplayName("nothing 판별 테스트 - nothing인 경우")
    @Test
    void nothing_test() {
        // given
        Ball[] balls1 = {new Ball(5, 1), new Ball(6, 2), new Ball(1, 3)};
        BallSet ballSet1 = new BallSet(balls1);

        Ball[] balls2 = {new Ball(2, 1), new Ball(7, 2), new Ball(9, 3)};
        BallSet ballSet2 = new BallSet(balls2);

        boolean expectNothing = true;

        // when
        Referee referee = new Referee(ballSet1, ballSet2);
        GameResult result = referee.judge();

        // then
        assertThat(result.isNothing()).isEqualTo(expectNothing);
    }

    @DisplayName("nothing 판별 테스트 - nothing인 아닌 경우")
    @Test
    void not_nothing_test() {
        // given
        Ball[] balls1 = {new Ball(2, 1), new Ball(6, 2), new Ball(2, 3)};
        BallSet ballSet1 = new BallSet(balls1);

        Ball[] balls2 = {new Ball(2, 1), new Ball(5, 2), new Ball(6, 3)};
        BallSet ballSet2 = new BallSet(balls2);

        boolean expectNothing = false;

        // when
        Referee referee = new Referee(ballSet1, ballSet2);
        GameResult result = referee.judge();

        // then
        assertThat(result.isNothing()).isEqualTo(expectNothing);
    }
}
