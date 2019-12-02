package javaMain.GameTest;


import javaMain.Game.MinesweeperGame;
import javaMain.Input.CellInput;
import javaMain.Input.BoardInput;
import javaMain.Input.UserInput;
import org.junit.Test;
import org.mockito.Mockito;


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
    CellInput cellInput = Mockito.mock(CellInput.class);
        when(boardInput.enterPerimeter()).thenReturn("00");
        String expected= "Output:\n";
        when(boardInput.enterPerimeter()).thenReturn("00");
        assertEquals(expected,minesweeperGame.startGame(boardInput,cellInput));
    }
}