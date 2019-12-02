package javaMain;

import javaMain.Game.MinesweeperGame;
import javaMain.Input.CellInput;
import javaMain.Input.BoardInput;
import javaMain.Input.UserInput;

public class App {
    public static void main(String[] args) {
        UserInput userInput = new UserInput();
        BoardInput boardInput = new BoardInput(userInput);
        CellInput cellInput = new CellInput(userInput);
        MinesweeperGame minesweeperGame = new MinesweeperGame(userInput, boardInput,cellInput);
        System.out.println(minesweeperGame.startGame(boardInput,cellInput));
    }
}
