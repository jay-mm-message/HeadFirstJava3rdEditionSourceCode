package ch2______;

class Triangle {
    double area;
    int height;
    int length;
}

public class TriangleTestDrive {
    public static void main(String [] args){
        Triangle[] t = new Triangle[4];

        for (int i = 0 ; i < 4 ; ++i) {
            t[i] = new Triangle();
            t[i].height = (i + 1) * 2;
            t[i].length = i + 4;

            System.out.println("triangle " + i + ", area = " + (i + 1) * t[i].length);
        }
    }
    
}