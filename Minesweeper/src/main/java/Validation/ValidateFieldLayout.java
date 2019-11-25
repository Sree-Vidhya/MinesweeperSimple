package Validation;


import Input.UserInput;

public class ValidateFieldLayout {

    UserInput userInput;

    public ValidateFieldLayout(UserInput userInput) {
        this.userInput = userInput;
    }
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
        if(inputToValidate.length() == 2)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public boolean validateTheFormatandLength(String inputToValidate)
    {
        if(validateTheInput(inputToValidate) == true)
        {
            return checkingifInputLengthIsTwo(inputToValidate);
        }
        return false;
    }
    public String enterFieldLayout()
    {
        String fieldLayout = userInput.inputInNextLine();

        while(validateTheFormatandLength(fieldLayout) == false)
        {
            System.out.println("Not a Valid integer. Try Again!.");
            fieldLayout = userInput.inputInNextLine();
        }
        return fieldLayout;
    }
}
