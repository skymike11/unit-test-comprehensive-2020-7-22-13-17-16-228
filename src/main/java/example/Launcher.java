package example;

import java.util.Scanner;

import static example.Constant.*;

/**
 * @Auther Sam Li
 * @Date 2020-07-23
 */
public class Launcher {
    public void play() {
        System.out.println(WELCOME_TIP);
        int times = 6;
        CalibrationTool calibrationTool = new CalibrationTool();
        Scanner scan = new Scanner(System.in);
        for (int time = times; time > 0; time--) {
            int[] inputGuess = new int[4];
            for (int j = 0; j < inputGuess.length; j++) {
                inputGuess[j] = scan.nextInt();
            }
            if (!calibrationTool.isLegalInputGuess(inputGuess)) {
                System.out.println(INPUT_ERR_TIP);
                break;
            } else {
                GuessNumber guessNumber = new GuessNumber(new AnswerGeneratorImpl());
                System.out.println(PrintTool.printAnswerResult(guessNumber.guess(inputGuess)));
            }
        }
        System.out.println(END_GAME);
    }
}
