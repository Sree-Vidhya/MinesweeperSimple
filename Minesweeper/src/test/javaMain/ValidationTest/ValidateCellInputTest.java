package javaMain.ValidationTest;

import javaMain.Validation.ValidateCellInput;
import org.junit.Test;

import static org.junit.Assert.assertTrue;


public class ValidateCellInputTest {
       private ValidateCellInput validateCellInput = new ValidateCellInput();
    @Test
    public void validateTheInput() {
        assertTrue(validateCellInput.validateTheInput("."));
    }
}
