package example;

import java.util.Arrays;

/**
 * @Auther Sam Li
 * @Date 2020-07-23
 */
public class GuessNumber {

    private int[] answer;

    public GuessNumber(AnswerGenerator answerGenerator) {
        this.answer = answerGenerator.generator();
    }

    public String guess(int[] inputGuess) {
        return String.format("%dA%dB", countAnswerA(inputGuess), countAnswerB(inputGuess));
    }

    private int countAnswerA(int[] inputGuess) {
        int correctNumber = 0;
        for (int i = 0; i < inputGuess.length; i++) {
            if (inputGuess[i] == answer[i]) {
                correctNumber++;
            }
        }
        return correctNumber;
    }

    private int countAnswerB(int[] inputGuess) {
        int correctNumber = 0;
        for (int i = 0; i < inputGuess.length; i++) {
            int position = Arrays.binarySearch(answer, inputGuess[i]);
            if (position >= 0 && position != i) {
                correctNumber++;
            }
        }
        return correctNumber;
    }
}
