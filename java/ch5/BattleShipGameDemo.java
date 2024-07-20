package ch5;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JLabel;

class BattleShip {
    // state
    private ArrayList<Integer> shipLocation;
    // init
    private static volatile BattleShip uniqueInstance = null;
    private BattleShip() {
        this.shipLocation = new ArrayList<Integer>();
    }
    public static BattleShip getInstance() {
        if (null == uniqueInstance) {
            synchronized(BattleShip.class) {
                if (null == uniqueInstance) {
                    uniqueInstance = new BattleShip();
                }
            }
        }
        return uniqueInstance;
    }
    // todo
    public void setShipLocation(int[] shipLocation) {
        for(int s : shipLocation) {
            this.shipLocation.add(s);
        }
    }
    public String checkHitResult(int hitLocation) {

        if (this.shipLocation.contains(hitLocation)) {
            //this.shipLocation.remove(hitLocation);
            this.shipLocation.remove(this.shipLocation.indexOf(hitLocation));
            if (this.shipLocation.isEmpty()) {
                return "kill";
            }
            return "hit";
        }
        return "miss";
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

        /*
         *         // Create a JFrame
        JFrame frame = new JFrame("Swing Example");

        // Set the size of the frame
        frame.setSize(300, 200);

        // Set default close operation
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a label and add it to the frame
        JLabel label = new JLabel("Hello, Swing!", JLabel.CENTER);
        frame.add(label);

        // Make the frame visible
        frame.setVisible(true);
         */
        JFrame frame = new JFrame("Battle ship");
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label = new JLabel("Total guess: " + guessTotal);
        frame.add(label);
        frame.setVisible(true);
        // System.out.println("Total guess: " + guessTotal);
    }

    
}
