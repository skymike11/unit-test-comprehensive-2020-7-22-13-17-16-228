package example;

import java.util.Scanner;

import static example.Constant.*;

/**
 * @Auther Sam Li
 * @Date 2020-07-23
 */
public class Launcher {

    private GuessNumber guessNumber;

    private final int GAME_TIMES = 6;

    public Launcher() {
        guessNumber = new GuessNumber(new AnswerGeneratorImpl());
    }

    public void process() {
        System.out.println(WELCOME_TIP);
        for (int time = GAME_TIMES; time > 0; time--) {
            int[] inputGuess = getUserInput();
            System.out.println(run(inputGuess));

        }
        System.out.println(END_GAME);
    }

    public String run(int[] inputGuess) {
        if (!VerifyHelper.isLegalInputGuess(inputGuess)) {
            return INPUT_ERR_TIP;
        } else {
            return PrintTool.printAnswerResult(guessNumber.guess(inputGuess));
        }
    }

    public int[] getUserInput() {
        Scanner scan = new Scanner(System.in);
        int[] inputGuess = new int[4];
        for (int j = 0; j < inputGuess.length; j++) {
            inputGuess[j] = scan.nextInt();
        }
        return inputGuess;
    }
}
