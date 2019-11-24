import Field.Cell;

public class App {
    public static void main(String[] args) {
        Cell cell = new Cell("*");
        System.out.println(cell.isMine());
        System.out.println(cell.toString());
        System.out.println(cell.increaseValue());
        System.out.println(cell.isMine());
        System.out.println(cell.toString());
    }
}
