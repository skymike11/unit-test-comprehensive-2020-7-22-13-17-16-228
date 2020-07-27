package example;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @Auther Sam Li
 * @Date 2020-07-23
 */
public class VerifyHelper {

    public boolean isLegalInputGuess(int[] inputGuess) {
        if (inputGuess.length < 4) {
            return false;
        }

        return !(isRepeated(inputGuess) || isOutOfRange(inputGuess));
    }

    private boolean isRepeated(int[] inputGuess) {
        Set<Integer> inputGuessSet = Arrays.stream(inputGuess)
                .boxed()
                .collect(Collectors.toSet());
        return inputGuessSet.size() != inputGuess.length;
    }

    private boolean isOutOfRange(int[] inputGuess) {
        return Arrays.stream(inputGuess).anyMatch(item -> item > 9 || item < 0);
    }
}
