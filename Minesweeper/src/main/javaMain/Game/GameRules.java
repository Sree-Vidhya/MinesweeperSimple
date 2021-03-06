package javaMain.Game;
import javaMain.Field.Cell;
import javaMain.Field.Board;
import java.util.ArrayList;
public class GameRules {
    String layout;
    Board grid = new Board();
    GameBoard gameBoard;
    Cell[][] fieldCreated;
    int rows;
    int columns;
    int totalCells;
    public GameRules(GameBoard gameBoard, String layout, ArrayList fieldList) {
        this.gameBoard = gameBoard;
        rows = grid.row(layout);
        columns = grid.column(layout);
        totalCells = grid.totalCells(layout);
        fieldCreated = gameBoard.getMatrix();
    }

    private boolean checkCellAbove(int row, int column) {
        return (row > 0 && fieldCreated[row - 1][column].isMine().equals("*"));
    }
    private boolean checkCellBelow(int row, int column) {
        return (row < rows - 1 && fieldCreated[row + 1][column].isMine().equals("*"));
    }

    private boolean checkCellLeft(int row, int column) {
        return (column > 0 && fieldCreated[row][column - 1].isMine().equals("*"));
    }

    private boolean checkCellRight(int row, int column) {
        return (column < columns -1 && fieldCreated[row][column + 1].isMine().equals("*"));
    }
    private boolean checkCellTopLeft(int row, int column) {
        return (row > 0 && column > 0 && fieldCreated[row - 1][column-1].isMine().equals("*"));
    }
    private boolean checkCellTopRight(int row, int column) {
        return (row > 0 && column < columns -1 && fieldCreated[row - 1][column + 1].isMine().equals("*"));
    }
    private boolean checkCellBottomLeft(int row,int column) {
        return (row < rows - 1 && column > 0 && fieldCreated[row + 1][column - 1].isMine().equals("*"));
    }
    private boolean checkCellBottomRight(int row,int column) {
        return (row < rows - 1 && column < columns -1 && fieldCreated[row + 1][column + 1].isMine().equals("*"));
    }

    private Cell[][] calculateCellValue(int row,int column) {
        if (checkCellAbove(row,column)) fieldCreated[row][column].increaseValue();
        if (checkCellBelow(row,column)) fieldCreated[row][column].increaseValue();
        if (checkCellLeft(row, column)) fieldCreated[row][column].increaseValue();
        if (checkCellRight(row, column)) fieldCreated[row][column].increaseValue();
        if (checkCellTopLeft(row, column)) fieldCreated[row][column].increaseValue();
        if (checkCellTopRight(row, column)) fieldCreated[row][column].increaseValue();
        if (checkCellBottomLeft(row, column)) fieldCreated[row][column].increaseValue();
        if (checkCellBottomRight(row,column)) fieldCreated[row][column].increaseValue();
        return fieldCreated;
    }
    public String calculateAllCells(String layout) {
        int rows = grid.row(layout);
        int columns = grid.column(layout);
        StringBuilder sb = new StringBuilder();
        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < columns; column++) {
                    sb.append(calculateCellValue(row,column)[row][column].isMine());
                sb.append("\t");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
