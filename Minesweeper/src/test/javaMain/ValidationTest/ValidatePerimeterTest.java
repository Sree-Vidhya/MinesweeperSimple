package javaMain.ValidationTest;

import javaMain.Validation.ValidatePerimeter;
import org.junit.Test;

import static org.junit.Assert.*;

public class ValidatePerimeterTest {
    private ValidatePerimeter validatePerimeter = new ValidatePerimeter();

    @Test
    public void alphabetInputReturnsFalse() {
        assertFalse(validatePerimeter.validateTheInput("a"));
    }
    @Test
    public void twoIntegerReturnsTrue() {
        assertTrue(validatePerimeter .checkingifInputLengthIsTwo("44"));
    }
    @Test
    public void oneIntegerReturnsFalse() {
        assertFalse(validatePerimeter .checkingifInputLengthIsTwo("4"));
    }
    @Test
    public void emptyInputReturnsFalse() {
        assertFalse(validatePerimeter .validateTheInput("")); }
}
