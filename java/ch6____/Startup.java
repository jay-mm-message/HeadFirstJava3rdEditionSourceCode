package ch6____;

import java.util.ArrayList;

public class Startup {
    
    private String name;
    public String getName() {
        return name;
    }

    private ArrayList<String> locations;

    public void setName(String name) {
        this.name = name;
    };
    
    Startup(String name) {
        setName(name);
    }

    public void setLocationCells(ArrayList<String> loc) {
        locations = loc;
    };

    public String checkYourself(String userGuess) {

        String result = "miss";
        if (locations.contains(userGuess)) {
            result = "hit";

            locations.remove(userGuess);

            if (locations.isEmpty()) {
                result = "kill";
            }
        }
        return result;
    }
}
