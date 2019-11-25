package Validation;

import Input.UserInput;

import java.util.ArrayList;

public class ValidateCellInput implements ValidateUserInput {
    UserInput userInput;
    ArrayList field = new ArrayList();
    String eachCell;

    public ValidateCellInput(UserInput userInput) {
        this.userInput = userInput;
    }

    public boolean validateTheInput(String inputToValidate) {
        if(inputToValidate.equals(".") ||inputToValidate.equals("*") ){
            return true;
        }
        else{
            return false;
        }
    }
    public ArrayList<String> CreatingField(int totalNumberOfCells){

        System.out.println("Enter the Input for Each Cell: \n'.' for safe zone.\n'*' for mine zone");
        for(int i =0 ; i < totalNumberOfCells ; i++) {
            eachCell = userInput.inputInSameLine();
            while (validateTheInput(eachCell) == false) {
                System.out.println("Not a Valid Input");
                eachCell = userInput.inputInSameLine();
            }
            field.add(eachCell);
        }
        return field;
    }
}
