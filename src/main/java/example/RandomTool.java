package example;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * @Auther Sam Li
 * @Date 2020-07-23
 */
public class RandomTool {
    public static int[] randomAnswerList(int min, int max) {
        int[] answers = new int[4];
        int position = 0;
        Random rand = new Random();
        for (int i = 0; i < answers.length; i++) {
            int answer = rand.nextInt(max - min + 1) + min;
            while (Arrays.binarySearch(answers, answer) >= 0) {
                answer = rand.nextInt(max - min + 1) + min;
            }
            answers[i] = answer;
        }
        for (int answer : answers) {
            System.out.println(answer);
        }
        return answers;
    }
}
