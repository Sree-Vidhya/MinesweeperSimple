package javaMain;

import javaMain.Field.Perimeter;
import javaMain.Game.GameBoard;
import javaMain.Game.GameOutput;
import javaMain.Input.CellInput;
import javaMain.Input.UserInput;



public class App {
    public static void main(String[] args) {
        UserInput userInput = new UserInput();
        CellInput cellInput;
        String grid = userInput.inputInNextLine();
        StringBuilder output = new StringBuilder();
        GameOutput gameOutput;
        int fieldNumber = 0;
        do {
            cellInput = new CellInput(userInput);
            GameBoard gameBoard = new GameBoard(grid);
            Perimeter perimeter = new Perimeter(grid);
            gameOutput = new GameOutput(grid, perimeter, gameBoard, cellInput);
            output.append("Field #"+(++fieldNumber)+":");
            output.append(gameOutput.display(gameBoard));
            output.append("\n");
            System.out.println();
            userInput = new UserInput();
            grid = userInput.inputInNextLine();
            System.out.println();
        }while(!(grid.equals("00")));
        System.out.println(output.toString());
    }
}
