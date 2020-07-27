package example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RandomToolTest {

    @Test
    void should_return_legal_answers_when_random_create_given_min_and_max() {
        //given
        int min = 1;
        int max = 9;
        VerifyHelper verifyHelper = new VerifyHelper();
        // when
        boolean result = verifyHelper.isLegalInputGuess(RandomTool.randomAnswerList(min, max));

        //then
        assertTrue(result);
    }
}