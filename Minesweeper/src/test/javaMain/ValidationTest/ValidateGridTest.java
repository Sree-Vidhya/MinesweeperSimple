package javaMain.ValidationTest;

import javaMain.Validation.BoardValidateUserInput;
import org.junit.Test;

import static org.junit.Assert.*;

public class ValidateGridTest {
    private BoardValidateUserInput boardValidateUserInput = new BoardValidateUserInput();

    @Test
    public void alphabetInputReturnsFalse() {
        assertFalse(boardValidateUserInput.validateTheInput("a"));
    }
    @Test
    public void twoIntegerReturnsTrue() {
        assertTrue(boardValidateUserInput.checkingifInputLengthIsTwo("44"));
    }
    @Test
    public void oneIntegerReturnsFalse() {
        assertFalse(boardValidateUserInput.checkingifInputLengthIsTwo("4"));
    }
    @Test
    public void emptyInputReturnsFalse() {
        assertFalse(boardValidateUserInput.validateTheInput("")); }
}
