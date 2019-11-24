package Field;

public class FieldLayout {
    String layout;
    int rows;
    int columns;
    int totalCells;

    public FieldLayout(String layout) {
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
    public int totalCells(int rows,int columns){
        totalCells = rows * columns;
        return totalCells;
    }

    @Override
    public String toString() {
        return "FieldLayout{" +
                "layout='" + layout + '\'' +
                ", rows=" + rows +
                ", columns=" + columns +
                ", totalCells=" + totalCells +
                '}';
    }
}
