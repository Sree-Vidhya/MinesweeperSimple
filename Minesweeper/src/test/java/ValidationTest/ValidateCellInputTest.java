package ValidationTest;

import Input.UserInput;
import Validation.ValidateCellInput;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;


public class ValidateCellInputTest {
        UserInput mockuserInput = Mockito.mock(UserInput.class);
        ValidateCellInput validateCellInput = new ValidateCellInput(mockuserInput);
    @Test
    public void validateTheInput() {
        assertEquals(true,validateCellInput.validateTheInput("."));
    }
}
