package baseball;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputReceiver implements ThreeNumberGenerator {

    private static final int MAX_PLAYER_INPUT_LENGTH = 3;

    private String getPlayerInput() {
        final Scanner sc = new Scanner(System.in);
        return sc.next();
    }

    private void validatePlayerInputLength(String playerInput) {
        if (playerInput.length() > MAX_PLAYER_INPUT_LENGTH) {
            throw new IllegalArgumentException("세 자리 숫자만 입력해주세요");
        }
    }

    private void validatePlayerInputThatIsNumber(String playerInput) {
        for (char c : playerInput.toCharArray()) {
            isDigitCharacter(c);
        }
    }

    private void isDigitCharacter(char c) {
        if (!Character.isDigit(c)) {
            throw new IllegalArgumentException("숫자만 입력해주세요");
        }
    }

    @Override
    public List<Integer> generateThreeNumbers() {
        String playerInput = getPlayerInput();
        validatePlayerInputLength(playerInput);
        validatePlayerInputThatIsNumber(playerInput);

        List<Integer> numbers = new ArrayList<>();
        for (String number : playerInput.split("")) {
            numbers.add(Integer.parseInt(number));
        }
        return numbers;
    }
}
