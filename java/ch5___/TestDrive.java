package ch5___;

public class TestDrive {
    public static void main(String [] args) {
        int value = 7;
        for (int i = 1 ; i < 8 ; ++i) {
            value++;
            if (i > 4) {
                System.out.print(++value + " ");
            }
            if (value > 14) {
                System.out.println(" i = " + i);
                break;
            }
        }
    }
}
