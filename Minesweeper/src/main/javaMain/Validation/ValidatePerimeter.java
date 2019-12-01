package javaMain.Validation;

public class ValidatePerimeter {

    public boolean validateTheInput(String inputToValidate) {
        try {
            Integer.parseInt(inputToValidate);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }
    public boolean checkingifInputLengthIsTwo(String inputToValidate)
    {
        return (inputToValidate.length() == 2);
    }
    public boolean validateTheFormatandLength(String inputToValidate)
    {
        return (validateTheInput(inputToValidate));
    }
}
