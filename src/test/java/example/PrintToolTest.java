package example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrintToolTest {

    @Test
    void should_return_1correct_0wrong_position_when_print_given_1A0B() {
        //given
        String code = "1A0B";
        //when

        String result = PrintTool.printAnswerResult(code);
        //then
        assertEquals("1 correct，0 wrong position", result);
    }
}