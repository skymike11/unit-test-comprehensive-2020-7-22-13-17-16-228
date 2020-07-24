package example;

import java.util.Scanner;

/**
 * @Auther Sam Li
 * @Date 2020-07-23
 */
public class Launcher {

    public int[] getInputGuess() {
        Scanner scan = new Scanner(System.in);
        int[] inputGuess = new int[4];
        for (int j = 0; j < inputGuess.length; j++) {
            inputGuess[j] = scan.nextInt();
        }
        return inputGuess;
    }

    public void play(int[] inputGuess) {
        System.out.println("welcome to play, u have 6 chances, u only input 4 number which belong 1 - 9");
        int times = 6;
        CalibrationTool calibrationTool = new CalibrationTool();
        for (int i = times; i > 0; i--) {
            if (!calibrationTool.isLegalInputGuess(inputGuess)) {
                System.out.println("Wrong Input，Input again");
                break;
            } else {
                System.out.println(getGuessAnswer(inputGuess));
            }
        }
        System.out.println("Game Over");
    }

    private String getGuessAnswer (int[] inputGuess) {
        GuessNumber guessNumber = new GuessNumber(new AnswerGeneratorImpl());
        return PrintTool.printAnswerResult(guessNumber.guess(inputGuess));
    }
}
