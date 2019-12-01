package javaMain.Field;

public class Cell {
    public String input;
    private int value = 0;

    public Cell(String input) {
        this.input = input;
    }

    public int increaseValue() {
        return ++value;
    }

    public String isMine() {
        if(input.equals("*"))
        {
            return "*";
        }
        else {
            return Integer.toString(value);
        }
    }

    @Override
    public String toString() {
        return "Cell{" +
                "input='" + input + '\'' +
                ", value=" + value +
                '}';
    }

}
