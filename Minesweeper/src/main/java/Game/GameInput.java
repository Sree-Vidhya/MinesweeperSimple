package Game;

import Field.Cell;
import Field.FieldLayout;
import Input.UserInput;
import Validation.ValidateCellInput;
import Validation.ValidateFieldLayout;

public class GameInput {
    UserInput userInput ;
    ValidateFieldLayout validateFieldLayout ;
    String layout;
    FieldLayout  fieldLayout = new FieldLayout(layout);
    ValidateCellInput validateCellInput;
    Cell cell;
    int row,column,totalCells;
    private Cell[][] field;

    public GameInput(UserInput userInput, ValidateFieldLayout validateFieldLayout) {
        this.userInput = userInput;
        this.validateFieldLayout = validateFieldLayout;
    }
    private String validateLayoutInput(){
        layout = validateFieldLayout.enterFieldLayout();
        return layout;
    }
    public int generateRows(String layout){
        row = fieldLayout.row(layout);
        return row;
    }
    public int generateColumns(String layout){
        column = fieldLayout.column(layout);
        return column;
    }
    public int generateTotalCells(int row,int column){
        totalCells = fieldLayout.totalCells(row,column);
        return totalCells;
    }

}
