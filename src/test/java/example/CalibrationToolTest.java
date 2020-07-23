package example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalibrationToolTest {

    @Test
    void should_return_false_when_verify_given_1123() {
        //given
        int [] inputGuess = {1, 1, 2, 3};

        //when
        CalibrationTool calibrationTool = new CalibrationTool();
        boolean result = calibrationTool.verifyInputGuess(inputGuess);

        //then
        assertFalse(result);
    }

    @Test
    void should_return_false_when_verify_given_11230() {
        //given
        int [] inputGuess = {1, 1, 2, 30};

        //when
        CalibrationTool calibrationTool = new CalibrationTool();
        boolean result = calibrationTool.verifyInputGuess(inputGuess);

        //then
        assertFalse(result);
    }

}