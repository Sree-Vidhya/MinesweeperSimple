package javaMain.Validation;

public class ValidateCellInputImpl implements ValidateUserInput {

    public boolean validateTheInput(String inputToValidate) {
        return (inputToValidate.equals(".") ||inputToValidate.equals("*"));
    }
}
