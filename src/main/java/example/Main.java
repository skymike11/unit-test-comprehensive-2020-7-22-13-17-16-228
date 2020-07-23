package example;

import java.util.Scanner;

/**
 * @Auther Sam Li
 * @Date 2020-07-23
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("welcome to play, u have 6 chances, u only input 4 number which belong 1 - 9");
        int times = 6;
        CalibrationTool calibrationTool = new CalibrationTool();
        Scanner scan = new Scanner(System.in);
        for (int i = times; i > 0; i--) {
            int[] inputGuess = new int[4];
            for (int j = 0; j < inputGuess.length; j++) {
                inputGuess[j] = scan.nextInt();
            }
            if (!calibrationTool.isLegalInputGuess(inputGuess)) {
                System.out.println("Wrong Input，Input again");
                break;
            } else {
                GuessNumber guessNumber = new GuessNumber(new AnswerGeneratorImpl());
            }
        }
    }
}
