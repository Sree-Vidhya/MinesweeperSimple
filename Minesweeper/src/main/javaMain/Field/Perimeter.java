package javaMain.Field;


public class Perimeter {
    private String layout;
    private int rows;
    private int columns;
    private int totalCells;

    public Perimeter(String layout) {
        this.layout = layout;
    }
    public int row(String layout){
            String[] fieldLayout = (layout.split(""));
            rows = Integer.parseInt(fieldLayout[0]);
            return rows;
    }
    public int column(String layout){
            String[] fieldLayout = (layout.split(""));
            columns = Integer.parseInt(fieldLayout[1]);
            return columns;
    }
    public int totalCells(String layout){
        totalCells = row(layout) * column(layout);
        return totalCells;
    }

    @Override
    public String toString() {
        return "Perimeter{" +
                "layout='" + layout + '\'' +
                ", rows=" + rows +
                ", columns=" + columns +
                ", totalCells=" + totalCells +
                '}';
    }
}
