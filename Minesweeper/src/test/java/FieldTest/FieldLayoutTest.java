package FieldTest;

import org.junit.Test;

import static org.junit.Assert.*;

public class FieldLayoutTest {
    Field.FieldLayout fieldLayout = new Field.FieldLayout("35");
    @Test
    public void rowsReturnsNumberOfRowsFromTheInput() {
        assertEquals(3,fieldLayout.row());
    }

    @Test
    public void columnsReturnsNumberOfColumnsFromTheInput() {
        assertEquals(5,fieldLayout.column());
    }

    @Test
    public void totalCellsReturnsTotalNumberOfCells() {
        assertEquals(15,fieldLayout.totalCells(3,5));
    }
}
