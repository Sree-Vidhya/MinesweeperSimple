package javaMain.Validation;

public class ValidateCellInput implements ValidateUserInput {

    public boolean validateTheInput(String inputToValidate) {
        return (inputToValidate.equals(".") ||inputToValidate.equals("*"));
    }
}
