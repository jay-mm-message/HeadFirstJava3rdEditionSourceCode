package ch5__;

public class SimpleStartup {
    
    int numOfGuess;
    int[] locations;
    
    SimpleStartup() {
        numOfGuess = 0;
    }

    public void setLocations(int[] loc) {
        locations = loc;
    }

    public String checkSelf(int guess) {
        String ret = "miss";

        for(int i : locations) {
            if (guess == i) {
                ret = "hit";
                ++numOfGuess;

                if (numOfGuess == 3) {
                    ret = "kill";
                    break;
                }
            }
        }

        return ret;
    }
}
