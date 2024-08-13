package ch4___;

public class XCopy {
    public static void main(String [] args) {
        int org = 42;
        XCopy x = new XCopy();
        int y = x.go(org);
        System.out.println(org + " " + y);
    }
    
    int go(int arg) {
        arg = arg * 2;
        return arg;
    }
}
