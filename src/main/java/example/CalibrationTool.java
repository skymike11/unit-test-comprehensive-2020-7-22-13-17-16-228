package example;

/**
 * @Auther Sam Li
 * @Date 2020-07-23
 */
public class CalibrationTool {

    public boolean verifyInputGuess(int[] inputGuess) {
        if (inputGuess.length < 4) {
            return false;
        }
        int[] sign = new int[10];
        for (int item : inputGuess) {
            if (sign[item] == 0) {
                sign[item] = item;
            } else {
                return false;
            }
        }
        return true;
    }
}
