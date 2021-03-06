package javaMain.Game;

import javaMain.Field.Cell;
import javaMain.Field.Board;

import java.util.ArrayList;

public class GameBoard {
    private String layout;
    private Board grid = new Board();
    private int rows,columns,totalCells;
   private Cell[][] matrix;
    public GameBoard(String layout) {
        rows = grid.row(layout);
        columns = grid.column(layout);
        totalCells = grid.totalCells(layout);
    }
    public void creatingField(ArrayList field) {
        matrix = new Cell[rows][columns];
        int cell = 0;
        while (cell < totalCells) {
            for (int row = 0; row < this.rows; row++) {
                for (int column = 0; column < this.columns; column++) {
                    matrix[row][column] = new Cell((String) field.get(cell));
                    ++cell;
                }
            }
        }
    }
    public Cell[][] getMatrix() {
        return matrix;
    }
}
