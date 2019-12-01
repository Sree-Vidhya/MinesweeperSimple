package javaMain.Input;

import javaMain.Validation.ValidateCellInput;

import java.util.ArrayList;

public class CellInput {
    private UserInput userInput;
    private ArrayList field = new ArrayList();
    private ValidateCellInput validateCellInput = new ValidateCellInput();

    public CellInput(UserInput userInput) {
        this.userInput = userInput;
    }

    public ArrayList<String> CreatingField(int totalNumberOfCells){
        String eachCell;
//        System.out.println("Enter the Input for Each Cell: \n'.' for safe zone.\n'*' for mine zone");
        for(int i =0 ; i < totalNumberOfCells ; i++) {
            eachCell = userInput.inputInSameLine();
            while (!(validateCellInput.validateTheInput(eachCell))) {
                System.out.println("Not a Valid Input");
                eachCell = userInput.inputInSameLine();
            }
            field.add(eachCell);
        }
        return field;
    }
}
