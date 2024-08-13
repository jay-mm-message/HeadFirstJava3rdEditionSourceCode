package ch5_____;

import java.util.ArrayList;

public class SimpleStartupTestDrive {
    public static void main(String[] args) {
        
        SimpleStartup dot = new SimpleStartup();
        GameHelper gameHelper = new GameHelper();
        
        int numOfGuesses = 0;
        int num = (int) Math.random() % 5;

        ArrayList<Integer> locations = new ArrayList<>();
        locations.add(num++);
        locations.add(num++);
        locations.add(num++);

        dot.setLocations(locations);
        boolean again = true;
        
        while(again) {

            int guess = gameHelper.getUserInput("Please guess");
            ++numOfGuesses;
            String result = dot.checkSelf(guess);
            switch (result) {
                case "kill":
                    System.out.println(result);
                    again = false; 
                    break;
                case "hit":
                    System.out.println(result);
                    break;
                case "miss":
                    System.out.println(result);
                    break;
                default:
                    break;
            }
        } // while

        System.out.println("User guesses times: " + Integer.toString(numOfGuesses));
    } // main
}
