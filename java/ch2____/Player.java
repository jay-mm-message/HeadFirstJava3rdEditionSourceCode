package ch2____;

public class Player {

    private int number;

    public int guess() {
        
        number = (int) (Math.random() * 10);
        return number;
    }
}
