package javaMain.FieldTest;

import javaMain.Field.Perimeter;
import org.junit.Test;

import static org.junit.Assert.*;

public class PerimeterTest {
    private Perimeter perimeter = new Perimeter("35");
    @Test
    public void returnsNumberOfRowsFromtheInput() {
        assertEquals(3,perimeter.row("35"));
    }

    @Test
    public void returnsNumberOfColumnsFromtheInput() {
        assertEquals(5,perimeter.column("35"));
    }

    @Test
    public void returnsTotalCellsFromtheInput() {
        assertEquals(15,perimeter.totalCells("35"));
    }
}
