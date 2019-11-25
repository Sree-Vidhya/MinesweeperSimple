package Game;

import Field.Cell;
import Field.FieldLayout;
import Input.UserInput;
import Validation.ValidateFieldLayout;

import java.util.ArrayList;

public class GameInput {
    UserInput userInput ;
    ValidateFieldLayout validateFieldLayout;
    String layout;
    FieldLayout  fieldLayout = new FieldLayout(layout);
    int rows,columns,totalCells;
    Cell[][] matrix;
    public GameInput(UserInput userInput, ValidateFieldLayout validateFieldLayout) {
        this.userInput = userInput;
        this.validateFieldLayout = validateFieldLayout;
    }
    public int generateRows(String layout){
        rows = fieldLayout.row(layout);
        return rows;
    }
    public int generateColumns(String layout){
        columns = fieldLayout.column(layout);
        return columns;
    }
    public int generateTotalCells(int row,int column){
        totalCells = fieldLayout.totalCells(row,column);
        return totalCells;
    }
    public void creatingField(ArrayList field, String layout) {
        int rows = generateRows(layout);
        int columns = generateColumns(layout);
        int totalCells = generateTotalCells(rows,columns);
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
