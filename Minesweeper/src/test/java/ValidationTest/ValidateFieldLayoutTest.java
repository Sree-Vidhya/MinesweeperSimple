package ValidationTest;

import Input.UserInput;
import Validation.ValidateFieldLayout;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;
public class ValidateFieldLayoutTest {
    UserInput mockUserInput = Mockito.mock(UserInput.class);
    ValidateFieldLayout validateFieldLayout = new ValidateFieldLayout(mockUserInput);

    @Test
    public void testStringInputReturnsFalse() {
        when(mockUserInput.inputInNextLine())
                .thenReturn("a");
        assertEquals(false,validateFieldLayout.validateTheInput(mockUserInput.inputInNextLine()));
    }
    @Test
    public void testTwoIntegerReturnsTrue() {
        when(mockUserInput.inputInNextLine())
                .thenReturn("44");
        assertEquals(true,validateFieldLayout .checkingifInputLengthIsTwo(mockUserInput.inputInNextLine()));
    }
    @Test
    public void testOneIntegerReturnsFalse() {
        when(mockUserInput.inputInNextLine())
                .thenReturn("4");
        assertEquals(false,validateFieldLayout .checkingifInputLengthIsTwo(mockUserInput.inputInNextLine()));
    }
    @Test
    public void testEmptyInputReturnsFalse() {
        when(mockUserInput.inputInNextLine())
                .thenReturn("");
        assertEquals(false,validateFieldLayout .validateTheInput(mockUserInput.inputInNextLine())); }
}
