package ValidationTest;

import Input.UserInput;
import Validation.ValidateCellInput;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;


public class ValidateCellInputTest {
        UserInput mockuserInput = Mockito.mock(UserInput.class);
        ValidateCellInput validateCellInput = new ValidateCellInput(mockuserInput);
    @Test
    public void validateTheInput() {
        assertEquals(true,validateCellInput.validateTheInput("."));
    }
    @Test
    public void testFieldCreated(){
        ArrayList<String> testFieldContent = new ArrayList<String>();
        testFieldContent.add(".");
        testFieldContent.add("*");
        testFieldContent.add(".");
        testFieldContent.add(".");
        when(mockuserInput.inputInSameLine())
                .thenReturn(".")
                .thenReturn("*")
                .thenReturn(".")
                .thenReturn(".");
        assertEquals(testFieldContent,validateCellInput.CreatingField(4));
    }
}
