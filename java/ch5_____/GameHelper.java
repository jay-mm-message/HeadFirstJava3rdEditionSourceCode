package ch5_____;

import java.util.Scanner;

public class GameHelper {
    public int getUserInput(String prompt) {
        System.out.print(prompt + ": ");
        
        Scanner scanner = new Scanner(System.in);
        int val = scanner.nextInt();

        return val;
    }
}
