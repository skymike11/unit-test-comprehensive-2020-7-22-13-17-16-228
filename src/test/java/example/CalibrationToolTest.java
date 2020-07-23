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
        boolean result = calibrationTool.isLegalInputGuess(inputGuess);

        //then
        assertFalse(result);
    }

    @Test
    void should_return_false_when_verify_given_12330() {
        //given
        int [] inputGuess = {1, 2, 3, 30};

        //when
        CalibrationTool calibrationTool = new CalibrationTool();
        boolean result = calibrationTool.isLegalInputGuess(inputGuess);

        //then
        assertFalse(result);
    }

    @Test
    void should_return_false_when_verify_given_123() {
        //given
        int [] inputGuess = {1, 2, 3};

        //when
        CalibrationTool calibrationTool = new CalibrationTool();
        boolean result = calibrationTool.isLegalInputGuess(inputGuess);

        //then
        assertFalse(result);
    }

}