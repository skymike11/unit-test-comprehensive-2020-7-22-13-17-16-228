package example;

/**
 * @Auther Sam Li
 * @Date 2020-07-23
 */
public class PrintTool {

    public static String printAnswerResult (String code) {
        String [] splitByA = code.split("A");
        int correctA = Integer.parseInt(splitByA[0]);

        int correctB = Integer.parseInt(splitByA[1].split("B")[0]);
        return String.format("%d correct，%d wrong position", correctA, correctB);
    }
}
