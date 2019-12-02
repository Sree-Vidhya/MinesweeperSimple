package javaMain.ValidationTest;

import javaMain.Validation.ValidateCellInputImpl;
import org.junit.Test;

import static org.junit.Assert.assertTrue;


public class ValidateCellInputImplTest {
       private ValidateCellInputImpl validateCellInputImpl = new ValidateCellInputImpl();
    @Test
    public void validateTheInput() {
        assertTrue(validateCellInputImpl.validateTheInput("."));
    }
}
