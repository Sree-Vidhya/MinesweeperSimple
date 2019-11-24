package FieldTest;

import Field.Cell;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class CellTest {
    Cell cell = new Cell(".");

    @Test
    public void increaseValueIncreasesTheValueBy1() {
        assertEquals(1, cell.increaseValue());
    }

    @Test
    public void isMineReturnsZeroIfItsNotAMine(){
        assertEquals("0",cell.isMine());
    }
    @Test
    public void isMineReturnsMineIfItsaMine(){
        cell = new Cell("*");
        assertEquals("*",cell.isMine());
    }
}