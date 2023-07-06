package baseball;

public class Game {
    private final Computer computer;
    private GameResult gameResult;

    public Game(Computer computer) {
        this.computer = computer;
    }

    public void playingGame() {
        while (this.isNotGameOver()) {
            System.out.println("세자리 숫자를 입력해주세요");

            Player player = this.settingPlayer();
            Referee referee = this.settingReferee(player);
            this.gameResult = referee.judge();
        }

        System.out.println("정답입니다! :)");
    }

    private boolean isNotGameOver() {
        return this.gameResult == null || !this.gameResult.isGameOver();
    }

    private Referee settingReferee(Player player) {
        return new Referee(this.computer.getBallSet(), player.getBallSet());
    }

    private Player settingPlayer() {
        return new Player(new InputReceiver());
    }
}
