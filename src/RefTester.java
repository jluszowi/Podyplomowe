import java.awt.*;

public class RefTester {
    public static void main(String[] args) {
        Point pt1, pt2;
        pt1 = new Point(100,100);
        pt2 = new Point(100,100);


        pt1.x = 200;
        pt1.y = 300;

        Point pt3 = pt2;

        System.out.println("Punkt 1: " + pt1.x + " " + pt1.y);
        System.out.println("Punkt 2: " + pt2.x + " " + pt2.y);
        System.out.println("Punkt 3: " + pt3.x + " " + pt3.y);



    }
}
