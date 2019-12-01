package javaMain.Input;

import java.util.Scanner;

public class UserInput {
    Scanner input = new Scanner(System.in);
    public String inputInSameLine()
    {
        return input.next();
    }
    public String inputInNextLine()
    {
        return input.nextLine();
    }
}
