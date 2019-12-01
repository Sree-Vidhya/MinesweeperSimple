package javaMain.GameTest;

import javaMain.Field.Cell;
import javaMain.Field.Perimeter;
import javaMain.Game.GameBoard;
import javaMain.Game.GameOutput;
import javaMain.Input.CellInput;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GameOutputTest {
    String layout = "22";
    ArrayList testFieldContent = new ArrayList();
    GameBoard gameBoard;
    Perimeter perimeter;
    CellInput cellInput = Mockito.mock(CellInput.class);
    @Test
    public void trial() {
        gameBoard = new GameBoard(layout);
        perimeter = new Perimeter(layout);
        testFieldContent.add(".");
        testFieldContent.add(".");
        testFieldContent.add("*");
        testFieldContent.add(".");
        String expected = "1\t1\t\n*\t1\t\n";
        gameBoard.creatingField(testFieldContent);
        GameOutput gameOutput = new GameOutput("22",perimeter,gameBoard,cellInput);
        when(cellInput.CreatingField(4)).thenReturn(testFieldContent);
        System.out.println(gameOutput.display(gameBoard));

    }

}
