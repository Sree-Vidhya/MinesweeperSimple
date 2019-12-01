package javaMain.GameTest;

import javaMain.Field.Cell;
import javaMain.Game.GameBoard;
import javaMain.Input.CellInput;
import javaMain.Input.UserInput;
import org.junit.Test;
import org.mockito.Mockito;
import java.util.ArrayList;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GameBoardTest {
    private UserInput mockUserInput = Mockito.mock(UserInput.class);
    private CellInput cellInput = Mockito.mock(CellInput.class);
    private GameBoard gameBoard = new GameBoard("22");

    @Test
    public void fieldCreated() {
        StringBuilder sb = new StringBuilder();
        when(mockUserInput.inputInNextLine()).thenReturn("22");
        ArrayList testFieldContent = new ArrayList();
        testFieldContent.add(".");
        testFieldContent.add(".");
        testFieldContent.add("*");
        testFieldContent.add(".");
        when(cellInput.CreatingField(4)).thenReturn(testFieldContent);
        gameBoard.creatingField(cellInput.CreatingField(4));
        Cell[][] field = gameBoard.getMatrix();
        for (int row = 0; row < 2; row++) {
            for (int column = 0; column < 2; column++) {
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
