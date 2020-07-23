package example;

/**
 * @Auther Sam Li
 * @Date 2020-07-23
 */
public class AnswerGeneratorImpl implements AnswerGenerator {
    @Override
    public int[] generator() {
        return RandomTool.randomAnswerList(1, 9);
    }
}
