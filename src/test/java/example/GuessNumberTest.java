package example;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;
/*
| 数字且位置正确\数字正确 | 全正确 | 部分正确 | 都不正确 |
| ----------------------- | ------ | -------- | -------- |
| 全正确                  | 4A0B   | x        | x        |
| 部分正确                | x      | 1A2B     | x        |
| 都不正确                | x      | 0A4B     | 0A0B     |
 */
class GuessNumberTest {

    @Test
    void should_return_4A0B_when_given_answer_1234_and_input_guess_1234() {
        //given
        int[] answer = {1, 2, 3, 4};
        AnswerGenerator answerGenerator = Mockito.mock(AnswerGenerator.class);
        when(answerGenerator.generator()).thenReturn(answer);
        GuessNumber guessNumber = new GuessNumber(answerGenerator);

        //when
        int [] inputGuess = {1, 2, 3, 4};
        String result = guessNumber.guess(inputGuess);

        //then
        assertEquals("4A0B", result);
    }

    @Test
    void should_return_1A2B_when_given_answer_1234_and_input_guess_0324() {
        //given
        int[] answer = {1, 2, 3, 4};
        AnswerGenerator answerGenerator = Mockito.mock(AnswerGenerator.class);
        when(answerGenerator.generator()).thenReturn(answer);
        GuessNumber guessNumber = new GuessNumber(answerGenerator);

        //when
        int [] inputGuess = {0, 3, 2, 4};
        String result = guessNumber.guess(inputGuess);

        //then
        assertEquals("1A2B", result);
    }

}