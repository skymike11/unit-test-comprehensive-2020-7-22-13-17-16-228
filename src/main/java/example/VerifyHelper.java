package example;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @Auther Sam Li
 * @Date 2020-07-23
 */
public class VerifyHelper {

    private final static int LEGAL_LENGTH = 4;

    public static boolean isLegalInputGuess(int[] inputGuess) {
        return !(isInvalidLength(inputGuess) || isRepeated(inputGuess) || isOutOfRange(inputGuess));
    }

    private static boolean isInvalidLength(int[] inputGuess) {
        return inputGuess.length < LEGAL_LENGTH;
    }

    private static boolean isRepeated(int[] inputGuess) {
        Set<Integer> inputGuessSet = Arrays.stream(inputGuess)
                .boxed()
                .collect(Collectors.toSet());
        return inputGuessSet.size() != inputGuess.length;
    }

    private static boolean isOutOfRange(int[] inputGuess) {
        return Arrays.stream(inputGuess).anyMatch(item -> item > 9 || item < 0);
    }
}
