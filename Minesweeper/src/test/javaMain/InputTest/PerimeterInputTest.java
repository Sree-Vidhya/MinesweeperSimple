package javaMain.InputTest;

import javaMain.Input.PerimeterInput;
import javaMain.Input.UserInput;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

public class PerimeterInputTest {
    @Test
    public void validInputReturnsInput(){
        UserInput userInputMock = Mockito.mock(UserInput.class);
        PerimeterInput perimeterInput = new PerimeterInput(userInputMock);
        String expected = "22";
        when(userInputMock.inputInNextLine())
                .thenReturn("22");
        assertEquals(expected,perimeterInput.enterPerimeter());
    }
}
