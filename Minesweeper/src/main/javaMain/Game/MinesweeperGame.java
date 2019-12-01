package javaMain.Game;

import javaMain.Field.Perimeter;
import javaMain.Input.CellInput;
import javaMain.Input.PerimeterInput;
import javaMain.Input.UserInput;

import java.util.ArrayList;

public class MinesweeperGame {
    UserInput userInput;
    PerimeterInput perimeterInput;
    CellInput cellInput;
    GameBoard gameBoard;
    Perimeter perimeter;
    GameRules gameRules;
    String grid;
    StringBuilder sb = new StringBuilder();
    int fieldNumber = 0;
    ArrayList area = new ArrayList();

    public MinesweeperGame(UserInput userInput, PerimeterInput perimeterInput, CellInput cellInput) {
        this.userInput = userInput;
        this.perimeterInput = perimeterInput;
        this.cellInput = cellInput;
    }

    private void insideLoop(GameBoard gameBoard, Perimeter perimeter,String grid, CellInput cellInput,PerimeterInput perimeterInput){
        cellInput = new CellInput(userInput);
        gameBoard = new GameBoard(grid);
        perimeter = new Perimeter(grid);
        sb.append("Field #"+(++fieldNumber)+":");
        sb.append("\n");
        int totalCells = perimeter.totalCells(grid);
        area = cellInput.CreatingField(totalCells);
        gameBoard.creatingField(area);
        gameRules = new GameRules(gameBoard,grid,area);
        sb.append(gameRules.calculateAllCells(grid));
        sb.append("\n");
    }
    public String startGame(PerimeterInput perimeterInput, CellInput cellInput){
        grid = perimeterInput.enterPerimeter();
        sb.append("Output:\n\n");
        do {
            insideLoop(gameBoard,perimeter,grid,cellInput, perimeterInput);
            grid = perimeterInput.enterPerimeter();
        }while(!(grid.equals("00")));
        return sb.toString();
    }

}
