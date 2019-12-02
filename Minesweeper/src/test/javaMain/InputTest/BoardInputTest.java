package javaMain.InputTest;

import javaMain.Input.BoardInput;
import javaMain.Input.UserInput;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

public class BoardInputTest {
    @Test
    public void validInputReturnsInput(){
        UserInput userInputMock = Mockito.mock(UserInput.class);
        BoardInput boardInput = new BoardInput(userInputMock);
        String expected = "22";
        when(userInputMock.inputInNextLine())
                .thenReturn("22");
        assertEquals(expected, boardInput.enterPerimeter());
    }
}
