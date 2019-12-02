package javaMain.ValidationTest;

import javaMain.Validation.BoardValidateUserInputImpl;
import org.junit.Test;

import static org.junit.Assert.*;

public class BoardValidateUserInputImplTest {
    private BoardValidateUserInputImpl boardValidateUserInputImpl = new BoardValidateUserInputImpl();

    @Test
    public void alphabetInputReturnsFalse() {
        assertFalse(boardValidateUserInputImpl.validateTheInput("a"));
    }
    @Test
    public void twoIntegerReturnsTrue() {
        assertTrue(boardValidateUserInputImpl.checkingifInputLengthIsTwo("44"));
    }
    @Test
    public void oneIntegerReturnsFalse() {
        assertFalse(boardValidateUserInputImpl.checkingifInputLengthIsTwo("4"));
    }
    @Test
    public void emptyInputReturnsFalse() {
        assertFalse(boardValidateUserInputImpl.validateTheInput("")); }
}
