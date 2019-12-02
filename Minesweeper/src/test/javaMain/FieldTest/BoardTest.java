package javaMain.FieldTest;

import javaMain.Field.Board;
import org.junit.Test;

import static org.junit.Assert.*;

public class BoardTest {
    private Board grid = new Board();
    @Test
    public void returnsNumberOfRowsFromtheInput() {
        assertEquals(3, grid.row("35"));
    }

    @Test
    public void returnsNumberOfColumnsFromtheInput() {
        assertEquals(5, grid.column("35"));
    }

    @Test
    public void returnsTotalCellsFromtheInput() {
        assertEquals(15, grid.totalCells("35"));
    }
}
