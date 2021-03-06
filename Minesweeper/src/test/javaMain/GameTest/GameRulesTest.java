package javaMain.GameTest;
import javaMain.Game.GameBoard;
import javaMain.Game.GameRules;
import org.junit.Test;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class GameRulesTest {
    String layout = "22";

    GameBoard gameBoard;

    @Test
    public void returnsAllCellsAfterCalculating(){
        gameBoard = new GameBoard(layout);
        ArrayList testFieldContent = new ArrayList();
        testFieldContent.add(".");
        testFieldContent.add(".");
        testFieldContent.add("*");
        testFieldContent.add(".");
        String expected = "1\t1\t\n*\t1\t\n";
        gameBoard.creatingField(testFieldContent);
        GameRules gameRules = new GameRules(gameBoard,layout,testFieldContent);
        String actual = gameRules.calculateAllCells("22");
        assertEquals(expected,actual);
    }
}
