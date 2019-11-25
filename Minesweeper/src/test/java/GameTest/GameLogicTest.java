package GameTest;

import Game.GameInput;
import Game.GameLogic;
import Input.UserInput;
import Validation.ValidateCellInput;
import Validation.ValidateFieldLayout;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GameLogicTest {
    UserInput userInput = Mockito.mock(UserInput.class);
    ValidateFieldLayout validateFieldLayout = new ValidateFieldLayout(userInput);
    ValidateCellInput validateCellInputMock = Mockito.mock(ValidateCellInput.class);
    GameInput gameInput = new GameInput(userInput,validateFieldLayout);
    @Test
    public void returnsAllCellsAfterCalculating(){
        when(userInput.inputInNextLine()).thenReturn("22");
        String layout = userInput.inputInNextLine();
        int rows = gameInput.generateRows(layout);
        int columns = gameInput.generateColumns(layout);
        int totalCells = gameInput.generateTotalCells(rows, columns);
        ArrayList testFieldContent = new ArrayList();
        testFieldContent.add(".");
        testFieldContent.add(".");
        testFieldContent.add("*");
        testFieldContent.add(".");
        when(validateCellInputMock.CreatingField(testFieldContent.size())).thenReturn(testFieldContent);
        gameInput.creatingField(validateCellInputMock.CreatingField(totalCells),layout);
        GameLogic gameLogic = new GameLogic(gameInput,layout);
        String actual = gameLogic.calculateAllCells(rows, columns);
        String expected = "1\t1\t\n*\t1\t\n";
        assertEquals(expected,actual);
    }
}
