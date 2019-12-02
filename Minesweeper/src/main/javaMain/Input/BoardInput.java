package javaMain.Input;

import javaMain.Validation.BoardValidateUserInput;

public class BoardInput {
    private UserInput userInput;
    private BoardValidateUserInput boardValidateUserInput = new BoardValidateUserInput();
    public BoardInput(UserInput userInput) {
        this.userInput = userInput;
    }

    public String enterPerimeter()
    {
        String fieldLayout = userInput.inputInNextLine();

        while(!(boardValidateUserInput.validateTheFormatandLength(fieldLayout) ))
        {
            System.out.println("Try Again!");
            fieldLayout = userInput.inputInNextLine();
        }
        return fieldLayout;
    }
}
