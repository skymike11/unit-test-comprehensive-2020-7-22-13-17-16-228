package example;

import java.util.*;

/**
 * @Auther Sam Li
 * @Date 2020-07-23
 */
public class RandomTool {
    public static int[] randomAnswerList(int min, int max) {
        int[] answers = new int[4];
        Map<Integer, Integer> map = new HashMap<>();
        Random rand = new Random();
        int answer = rand.nextInt(max - min + 1) + min;
        for (int i = 0; i < answers.length; i++) {
            answer = rand.nextInt(max - min + 1) + min;
            while (map.get(answer) != null) {
                answer = rand.nextInt(max - min + 1) + min;
            }
            map.put(i, i);
            answers[i] = answer;
        }
        System.out.println("Correct Answer: " + Arrays.toString(answers));
        return answers;
    }
}
