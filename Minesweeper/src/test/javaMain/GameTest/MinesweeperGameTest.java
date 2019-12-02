package javaMain.GameTest;


import javaMain.Game.MinesweeperGame;
import javaMain.Input.CellInput;
import javaMain.Input.BoardInput;
import javaMain.Input.UserInput;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class MinesweeperGameTest {
    UserInput userInput = Mockito.mock(UserInput.class);
    BoardInput boardInput = Mockito.mock(BoardInput.class);
    CellInput cellInput = Mockito.mock(CellInput.class);
    @Test
    public void game() {
        MinesweeperGame minesweeperGame = new MinesweeperGame(userInput, boardInput,cellInput);
        when(boardInput.enterPerimeter()).thenReturn("22");
        ArrayList testFieldContent = new ArrayList();
        testFieldContent.add(".");
        testFieldContent.add(".");
        testFieldContent.add("*");
        testFieldContent.add(".");
        when(cellInput.CreatingField(4)).thenReturn(testFieldContent);
        when(boardInput.enterPerimeter()).thenReturn("00");
        String expected= "Output:\n";
        assertEquals(expected,minesweeperGame.startGame(boardInput,cellInput));
    }
}