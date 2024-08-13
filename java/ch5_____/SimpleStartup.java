package ch5_____;

import java.util.ArrayList;

public class SimpleStartup {
    
    int numOfGuess;
    ArrayList<Integer> locations;
    
    SimpleStartup() {
        numOfGuess = 0;
        locations = new ArrayList<>();
    }

    public void setLocations(ArrayList<Integer> loc) {
        locations = loc;
    }

    public String checkSelf(int guess) {

        int index = locations.indexOf(guess);
        System.out.println("guess: " + guess + ", index: " + index);

        if (index >= 0) {
            locations.remove(index);
            if (locations.size() == 0) {
                return "kill";
            }
            return "hit";
        }

        return "miss";
    }
}
