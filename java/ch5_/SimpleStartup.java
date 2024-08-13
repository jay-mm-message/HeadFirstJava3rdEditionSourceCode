package ch5_;

public class SimpleStartup {
    // store startup by array
    int [] locations;
    int numOfHit;

    SimpleStartup() {
        locations = new int[5];
        numOfHit = 0;
    }
    
    public void setLocation(int[] loc) {
        for(int i : loc) {
            int index = i - 1;
            locations[index] = 1;
        }
    }

    public String checkSelf(int guess) {

        int index = guess - 1;
        if (locations[index] == 1) {
            ++numOfHit;
            locations[index] = 0;
            if (numOfHit == 3)
                return "kill";
            else
                return "hit";
        }

        return "miss";
    }

    public void show() {
 
        for(int i : locations) {
            System.out.print(i);
            System.out.print(' ');
        }

        System.out.println();
    }
}
