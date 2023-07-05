package baseball;

public class BaseballGame {
    public static void main(String[] args) {
        Game game = new Game(new Computer());
        game.playingGame();
    }
}
