package example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.util.StringUtils;
import org.mockito.Mockito;

import static org.mockito.Mockito.when;

class LauncherTest {

    @Test
    void should_return_answer_when_play_given_random_guess_input() {
        //given
        AnswerGenerator answerGenerator = Mockito.mock(AnswerGenerator.class);
        when(answerGenerator.generator()).thenReturn(RandomTool.randomAnswerList(1, 9));

        //when
        Launcher launcher = new Launcher();
        String result = launcher.run(answerGenerator.generator());
        Assertions.assertTrue(StringUtils.isNotBlank(result));
    }
}