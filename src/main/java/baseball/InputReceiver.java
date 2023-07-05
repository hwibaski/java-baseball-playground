package baseball;

import java.util.Scanner;

public class InputReceiver {

    private static final int MAX_PLAYER_INPUT_LENGTH = 3;

    public static String getPlayerInputNum() {
        String playerInput = getPlayerInput();
        validatePlayerInputLength(playerInput);
        validatePlayerInputThatIsNumber(playerInput);
        return playerInput;
    }

    private static String getPlayerInput() {
        final Scanner sc = new Scanner(System.in);
        return sc.next();
    }

    private static void validatePlayerInputLength(String playerInput) {
        if (playerInput.length() > MAX_PLAYER_INPUT_LENGTH) {
            throw new IllegalArgumentException("세 자리 숫자만 입력해주세요");
        }
    }

    private static void validatePlayerInputThatIsNumber(String playerInput) {
        for (char c : playerInput.toCharArray()) {
            isDigitCharacter(c);
        }
    }

    private static void isDigitCharacter(char c) {
        if (!Character.isDigit(c)) {
            throw new IllegalArgumentException("숫자만 입력해주세요");
        }
    }
}
