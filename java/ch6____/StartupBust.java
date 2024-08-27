package ch6____;

import java.util.ArrayList;

public class StartupBust {
    private GameHelper helper = new GameHelper();
    private ArrayList<Startup> startups = new ArrayList<>();
    private int numOfGuesses = 0;
    private int numOfMin = 18;

    public void setUpGame() {

        startups.add(new Startup("poniez"));
        startups.add(new Startup("hacqi"));
        startups.add(new Startup("cabista"));

        String tables =   "Your goal is to sink three Startups. " + 
                        "\nponiez, hacqi, cabista " +
                        "\nTry to sink them all in the fewest number of guesses.";
        prompt(tables);

        for (Startup s : startups) {
            ArrayList<String> loc = helper.placeStartup(3);
            s.setLocationCells(loc);
        }
    }

    private void checkUserGuess(String  userGuess) {

        numOfGuesses++;
        String result = "miss";

        for(Startup startupToTest : startups) {
            result = startupToTest.checkYourself(userGuess);
            
            if (result.equals("hit")) {
                break;
            }

            if (result.equals("kill")) {
                startups.remove(startupToTest);
                break;
            }
        }

        prompt(result);
    }

    private void startPlay() {

        while(!startups.isEmpty()) {
            String userGuess = helper.getUserInput("Enter a guess");
            checkUserGuess(userGuess);
        }
        finishGame();
    }

    private void finishGame() {
        prompt("All Startups are dead! Your stock is now worthless");
        if (numOfGuesses <= numOfMin) {
            String tags = "It only took you " + numOfGuesses + " guesses." +
                            "\nYou got out before your options sank.";
            prompt(tags);
        } else {
            String tags = "Took you long enough. " + numOfGuesses + " guesses." +
                            "\nFish are dancing with your options.";
            prompt(tags);
        }
    }

    private void prompt(String msg) {
        System.out.println(msg);
    }
    public static void main(String [] args) {
        StartupBust startupBust = new StartupBust();
        startupBust.setUpGame();
        startupBust.startPlay();        
    }
    
}
