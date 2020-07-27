package example;

/**
 * @Auther Sam Li
 * @Date 2020-07-23
 */
public class VerifyHelper {

    public boolean isLegalInputGuess(int[] inputGuess) {
        if (inputGuess.length < 4) {
            return false;
        }

        return !isRepeatedOrOverLimit(inputGuess);
    }

    private boolean isRepeatedOrOverLimit (int[] inputGuess) {
        int[] sign = new int[10];
        for (int item : inputGuess) {
            if (item > 9){
                return true;
            }
            if (sign[item] == 0) {
                sign[item] = item;
            } else {
                return true;
            }
        }
        return false;
    }
}
