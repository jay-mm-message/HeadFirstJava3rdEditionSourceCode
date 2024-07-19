package ch5;

import java.util.Scanner;

class BattleShip {
    // state
    private int[] shipLocation;
    private int numOfHit;
    // init
    private static volatile BattleShip uniqeInstance = null;
    private BattleShip() {}
    public static BattleShip getInstance() {
        if (null == uniqeInstance) {
            synchronized(BattleShip.class) {
                if (null == uniqeInstance) {
                    uniqeInstance = new BattleShip();
                }
            }
        }
        return uniqeInstance;
    }
    // todo
    public void setShipLocation(int[] shipLocation) {
        this.shipLocation = shipLocation;
    }
    public String checkHitResult(int hitLocation) {
        String result = "miss";
        for(int i = 0 ; i < shipLocation.length ; ++i) {
            if (hitLocation == shipLocation[i]) {
                shipLocation[i] = -1;
                numOfHit++;
                result = "hit";
            }
            if (numOfHit == shipLocation.length) {
                result = "kill";
            }
        }
        return result;
    }
    public int prove() {
        pt("Please hit location: ");
        return new Scanner(System.in).nextInt();
    }
    
    public void pt(String msg) {
        System.out.println(msg);
    }
}

public class BattleShipGameDemo {
    public static void main(String [] args) {
        BattleShip battleShip = BattleShip.getInstance();

        int randNum = (int) Math.random() * 5 + 1;
        int[] locations = {randNum, randNum+1, randNum+2};
        battleShip.setShipLocation(locations);

        int guessTotal = 0;
        String result = "miss";
        while (!result.equals("kill")) {
            result = battleShip.checkHitResult(battleShip.prove());
            guessTotal++;
        }

        // System.out.println("kill ship !!! winner");
        System.out.println("Total guess: " + guessTotal);
    }
}
