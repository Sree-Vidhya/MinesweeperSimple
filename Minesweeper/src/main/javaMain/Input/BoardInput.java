package javaMain.Input;

import javaMain.Validation.BoardValidateUserInputImpl;

public class BoardInput {
    private UserInput userInput;
    private BoardValidateUserInputImpl boardValidateUserInputImpl = new BoardValidateUserInputImpl();
    public BoardInput(UserInput userInput) {
        this.userInput = userInput;
    }

    public String enterPerimeter()
    {
        String fieldLayout = userInput.inputInNextLine();

        while(!(boardValidateUserInputImpl.validateTheFormatandLength(fieldLayout) ))
        {
            System.out.println("Try Again!");
            fieldLayout = userInput.inputInNextLine();
        }
        return fieldLayout;
    }
}
