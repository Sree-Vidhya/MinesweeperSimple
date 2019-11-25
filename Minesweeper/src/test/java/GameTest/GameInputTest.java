package GameTest;

import Field.Cell;
import Game.GameInput;
import Input.UserInput;
import Validation.ValidateCellInput;
import Validation.ValidateFieldLayout;
import org.junit.Test;
import org.mockito.Mockito;
import java.util.ArrayList;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GameInputTest {
    UserInput mockUserInput = Mockito.mock(UserInput.class);
    ValidateFieldLayout validateFieldLayout = Mockito.mock(ValidateFieldLayout.class);
    ValidateCellInput validateCellInput = Mockito.mock(ValidateCellInput.class);
    GameInput gameInput = new GameInput(mockUserInput, validateFieldLayout);

    @Test
    public void generateRowsReturnsRows() {
        when(mockUserInput.inputInNextLine()).thenReturn("35");
        assertEquals(3, gameInput.generateRows("35"));
    }
    @Test
    public void generateColumnsReturnsColumns() {
        when(mockUserInput.inputInNextLine()).thenReturn("35");
        assertEquals(5, gameInput.generateColumns("35"));
    }

    @Test
    public void generateTotalCellsReturnsTotalNumberOfCells() {
        assertEquals(15, gameInput.generateTotalCells(3, 5));
    }

    @Test
    public void fieldCreated() {
        StringBuilder sb = new StringBuilder();
        when(mockUserInput.inputInNextLine()).thenReturn("22");
        int rows = gameInput.generateRows("22");
        int columns = gameInput.generateColumns("22");
        ArrayList testFieldContent = new ArrayList();
        testFieldContent.add(".");
        testFieldContent.add(".");
        testFieldContent.add("*");
        testFieldContent.add(".");
        when(validateCellInput.CreatingField(testFieldContent.size())).thenReturn(testFieldContent);
        gameInput.creatingField(validateCellInput.CreatingField(4),"22");
        Cell[][] field = gameInput.getMatrix();
        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < columns; column++) {
                sb.append(field[row][column] + "\t");
            }
            sb.append("\n");
        }
        String actual = sb.toString();
            String expected = "Cell{input='.', value=0}\tCell{input='.', value=0}\t\n" +
                    "Cell{input='*', value=0}\tCell{input='.', value=0}\t\n";
            assertEquals(expected, actual);
        }
    }
