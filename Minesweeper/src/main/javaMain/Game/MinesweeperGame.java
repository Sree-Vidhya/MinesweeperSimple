package javaMain.Game;

import javaMain.Field.Board;
import javaMain.Input.CellInput;
import javaMain.Input.BoardInput;
import javaMain.Input.UserInput;

import java.util.ArrayList;

public class MinesweeperGame {
    UserInput userInput;
    BoardInput boardInput;
    CellInput cellInput;
    GameBoard gameBoard;
    Board board;
    GameRules gameRules;
    String gridInput;
    StringBuilder sb = new StringBuilder();
    int fieldNumber = 0;
    ArrayList area = new ArrayList();

    public MinesweeperGame(UserInput userInput, BoardInput boardInput, CellInput cellInput) {
        this.userInput = userInput;
        this.boardInput = boardInput;
        this.cellInput = cellInput;
    }

    private void insideLoop(GameBoard gameBoard, Board board, String grid, CellInput cellInput, BoardInput boardInput){
        cellInput = new CellInput(userInput);
        gameBoard = new GameBoard(grid);
        board = new Board();
        sb.append("Field #"+(++fieldNumber)+":");
        sb.append("\n");
        int totalCells = board.totalCells(grid);
        area = cellInput.CreatingField(totalCells);
        gameBoard.creatingField(area);
        gameRules = new GameRules(gameBoard,grid,area);
        sb.append(gameRules.calculateAllCells(grid));
        sb.append("\n");
    }
    public String startGame(BoardInput boardInput, CellInput cellInput){
        sb.append("Output:\n");
        gridInput = boardInput.enterPerimeter();
        while(!(gridInput.equals("00"))){
            insideLoop(gameBoard, board,gridInput,cellInput, boardInput);
            userInput = new UserInput();
            boardInput = new BoardInput(userInput);
            gridInput = boardInput.enterPerimeter();
        }
        System.out.println(sb.toString());
        return sb.toString();
    }

}
