package ch6___;

import java.net.Inet4Address;
import java.util.ArrayList;

class Egg {
    int eggSerialNumber;
    Egg(int no) {
        eggSerialNumber = no;
    }
    
    int getEggSerialNumber() {
        return eggSerialNumber;
    }
}

public class TestDrive {

    public static void showEggBasket(ArrayList<Egg> eggBasket) {
        for(Egg e : eggBasket) {
            System.out.println("egg serial number: " + Integer.toString(e.getEggSerialNumber()));
        }
    }

    public static void createEggs(ArrayList<Egg> eggBasket, int number) {
        for(int n = 0 ; n < number ; ++n) {
            eggBasket.add(new Egg(n));
        }
    }

    public static void removeEggs(ArrayList<Egg> eggsBasket, int idx) {
        try {
            if (eggsBasket.get(idx) != null) {
                System.out.println("Remove eggs: " + Integer.toString(idx));
                eggsBasket.remove(idx);
            }
        } catch (Exception e) {
            System.out.println("Index is't exist " + Integer.toString(idx));
        }
    }
    public static void main(String [] args) {
        ArrayList<Egg> eggBasket = new ArrayList<>();

        createEggs(eggBasket, 6);
        
        showEggBasket(eggBasket);

        removeEggs(eggBasket, 3);

        showEggBasket(eggBasket);

    }
    
}
