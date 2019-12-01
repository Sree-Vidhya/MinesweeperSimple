package javaMain.Input;

import javaMain.Validation.ValidatePerimeter;

public class PerimeterInput {
    private UserInput userInput;
    private ValidatePerimeter validatePerimeter = new ValidatePerimeter();
    public PerimeterInput(UserInput userInput) {
        this.userInput = userInput;
    }

    public String enterPerimeter()
    {
        String fieldLayout = userInput.inputInNextLine();

        while(!(validatePerimeter.validateTheFormatandLength(fieldLayout) ))
        {
            System.out.println();
            fieldLayout = userInput.inputInNextLine();
        }
        return fieldLayout;
    }
}
