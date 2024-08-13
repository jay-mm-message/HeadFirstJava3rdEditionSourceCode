package ch1____;

public class EchoTestDrive {
    public static void main(String[] args) {
        Echo e1 = new Echo();

        int x = 0;
        while (x < 9) {
            e1.hello();
            x += 2;
        }
        System.out.println(x);
    }
}
