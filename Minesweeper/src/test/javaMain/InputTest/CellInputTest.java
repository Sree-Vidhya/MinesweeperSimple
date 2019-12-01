package javaMain.InputTest;

import javaMain.Input.CellInput;
import javaMain.Input.UserInput;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

public class CellInputTest {
@Test
    public void gettingInput() {
    UserInput userInputMock = Mockito.mock(UserInput.class);
    CellInput cellInput = new CellInput(userInputMock);
    ArrayList testCellInput = new ArrayList<>();
    testCellInput.add(".");
    testCellInput.add("*");
    testCellInput.add(".");
    testCellInput.add(".");
    when(userInputMock.inputInSameLine())
            .thenReturn(".")
            .thenReturn("*")
            .thenReturn(".")
            .thenReturn(".");
    assertEquals(testCellInput,cellInput.CreatingField(4));
    }
}
