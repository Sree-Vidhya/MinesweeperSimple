package javaMain;

import javaMain.Game.MinesweeperGame;
import javaMain.Input.CellInput;
import javaMain.Input.PerimeterInput;
import javaMain.Input.UserInput;

public class App {
    public static void main(String[] args) {
        UserInput userInput = new UserInput();
        PerimeterInput perimeterInput = new PerimeterInput(userInput);
        CellInput cellInput = new CellInput(userInput);
        MinesweeperGame minesweeperGame = new MinesweeperGame(userInput,perimeterInput,cellInput);
        System.out.println(minesweeperGame.startGame(perimeterInput,cellInput));
    }
}
