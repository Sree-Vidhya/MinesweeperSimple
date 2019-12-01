package javaMain.GameTest;


import javaMain.Game.MinesweeperGame;
import javaMain.Input.CellInput;
import javaMain.Input.PerimeterInput;
import javaMain.Input.UserInput;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class MinesweeperGameTest {
    UserInput userInput = Mockito.mock(UserInput.class);
    PerimeterInput perimeterInput = Mockito.mock(PerimeterInput.class);
    CellInput cellInput = Mockito.mock(CellInput.class);
    @Test
    public void game() {
        MinesweeperGame minesweeperGame = new MinesweeperGame(userInput,perimeterInput,cellInput);
        when(perimeterInput.enterPerimeter()).thenReturn("22");
        ArrayList testFieldContent = new ArrayList();
        testFieldContent.add(".");
        testFieldContent.add(".");
        testFieldContent.add("*");
        testFieldContent.add(".");
        when(cellInput.CreatingField(4)).thenReturn(testFieldContent);
        when(perimeterInput.enterPerimeter()).thenReturn("00");
        String expected= "Output:\n\nField #1:\n\n";
        assertEquals(expected,minesweeperGame.startGame(perimeterInput,cellInput));
    }
}