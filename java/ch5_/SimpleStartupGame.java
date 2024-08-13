package ch5_;

import java.util.Scanner;

public class SimpleStartupGame {
    public static void main(String [] args) {
        SimpleStartup simpleStartup = new SimpleStartup();
        
        int [] locations = {1,2,3};

        simpleStartup.setLocation(locations);

        boolean again = true;
        while (again) {
            System.out.print("Please guess index: ");
            Scanner scanner = new Scanner(System.in);
            int guess = scanner.nextInt();
            String result = simpleStartup.checkSelf(guess);
            switch (result) {
                case "hit":
                    System.out.println("hit");
                    simpleStartup.show();
                    break;
                case "kill":
                    System.out.println("kill");
                    simpleStartup.show();
                    again = false;
                    break;
                case "miss":
                    System.out.println("miss");
                    simpleStartup.show();
                    break;
                default:
                    break;
            }
        }
    }
}
