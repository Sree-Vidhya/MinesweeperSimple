package Validation;

import Input.UserInput;

public class ValidateCellInput implements ValidateUserInput {
    UserInput userInput;

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
}
