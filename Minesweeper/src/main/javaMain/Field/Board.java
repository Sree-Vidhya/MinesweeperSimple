package javaMain.Field;


public class Board {
    public int row(String layout){
            String[] fieldLayout = (layout.split(""));
        return Integer.parseInt(fieldLayout[0]);
    }
    public int column(String layout){
            String[] fieldLayout = (layout.split(""));
        return Integer.parseInt(fieldLayout[1]);
    }
    public int totalCells(String layout){
        return row(layout) * column(layout);
    }

}
