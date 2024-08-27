package ch6_;

import java.util.ArrayList;

class Egg {

}

public class TestDrive {
    public static void main(String [] args) {
        ArrayList<Egg> myList = new ArrayList<>();
        myList.add(new Egg());
        myList.add(new Egg());
        myList.add(new Egg());

        System.out.println(myList.size());
    }
    
}
