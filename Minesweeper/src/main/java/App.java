import Game.GameInput;
import Game.GameLogic;
import Input.UserInput;
import Validation.ValidateCellInput;
import Validation.ValidateFieldLayout;

public class App {
    public static void main(String[] args) {
        UserInput userInput = new UserInput();
        ValidateFieldLayout validateFieldLayout = new ValidateFieldLayout(userInput);
        ValidateCellInput validateCellInput = new ValidateCellInput(userInput);
        GameInput gameInput = new GameInput(userInput,validateFieldLayout);
        String layout = userInput.inputInNextLine();
        int rows = gameInput.generateRows(layout);
        int cols = gameInput.generateColumns(layout);
        int totalCells = gameInput.generateTotalCells(rows, cols);
        gameInput.creatingField(validateCellInput.CreatingField(totalCells),layout);
        GameLogic gameLogic = new GameLogic(gameInput,layout);
        System.out.println(gameLogic.calculateAllCells(rows,cols));

    }
}
