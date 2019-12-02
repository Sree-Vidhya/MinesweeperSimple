package javaMain.Input;

import javaMain.Validation.ValidateCellInputImpl;

import java.util.ArrayList;

public class CellInput {
    private UserInput userInput;
    private ArrayList field = new ArrayList();
    private ValidateCellInputImpl validateCellInputImpl = new ValidateCellInputImpl();

    public CellInput(UserInput userInput) {
        this.userInput = userInput;
    }

    public ArrayList<String> CreatingField(int totalNumberOfCells){
        String eachCell;
        for(int i =0 ; i < totalNumberOfCells ; i++) {
            eachCell = userInput.inputInSameLine();
            while (!(validateCellInputImpl.validateTheInput(eachCell))) {
                System.out.println("Not a Valid Input");
                eachCell = userInput.inputInSameLine();
            }
            field.add(eachCell);
        }
        return field;
    }
}
