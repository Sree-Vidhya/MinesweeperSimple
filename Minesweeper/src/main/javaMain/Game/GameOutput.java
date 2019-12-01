package javaMain.Game;

import javaMain.Field.Perimeter;
import javaMain.Input.CellInput;
import javaMain.Input.UserInput;

import java.util.ArrayList;

public class GameOutput {
    UserInput userInput = new UserInput();
    StringBuilder sb = new StringBuilder();
    GameBoard gameBoard;
    CellInput cellInput;
    Perimeter perimeter;
    ArrayList area = new ArrayList();
    String grid;

    public GameOutput(String grid,Perimeter perimeter,GameBoard gameBoard, CellInput cellInput) {
        this.grid = grid;
        this.perimeter = perimeter;
        this.gameBoard = gameBoard;
        this.cellInput = cellInput;
        this.sb = new StringBuilder();
    }

    public String display(GameBoard gameBoard){
        int rows = perimeter.row(grid);
        int columns = perimeter.column(grid);
        int totalCells = perimeter.totalCells(rows,columns);
        area = cellInput.CreatingField(totalCells);
        gameBoard.creatingField(area);
        GameRules gameRules = new GameRules(gameBoard,grid,area);
        sb.append("\n");
        sb.append(gameRules.calculateAllCells(rows,columns));
        return sb.toString();
    }

}
