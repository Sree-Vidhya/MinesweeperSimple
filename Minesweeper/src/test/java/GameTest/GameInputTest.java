package GameTest;

import Field.FieldLayout;
import Game.GameInput;
import Input.UserInput;
import Validation.ValidateFieldLayout;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GameInputTest {
        UserInput mockUserInput = Mockito.mock(UserInput.class);
    FieldLayout fieldLayout = new FieldLayout(mockUserInput.inputInNextLine());
    ValidateFieldLayout validateFieldLayout = new ValidateFieldLayout(mockUserInput);
   GameInput gameInput = new GameInput(mockUserInput, validateFieldLayout);
    @Test
    public void generateRowsReturnsRows() {
        when(mockUserInput.inputInNextLine()).thenReturn("35");
        assertEquals(3,gameInput.generateRows(mockUserInput.inputInNextLine()));
    }
    @Test
    public void generateColumnsReturnsColumns() {
        when(mockUserInput.inputInNextLine()).thenReturn("35");
        assertEquals(5,gameInput.generateColumns(mockUserInput.inputInNextLine()));
    }
    @Test
    public void generateTotalCellsReturnsTotalNumberOfCells() {
        assertEquals(15,gameInput.generateTotalCells(3,5));
    }
}
