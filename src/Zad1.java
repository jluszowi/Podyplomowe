import java.util.StringTokenizer;

public class Zad1 {

    public static void main(String[] args) {

        StringTokenizer st1;

        String quotel = "29/04/2016";
        st1 = new StringTokenizer(quotel, "/");

        System.out.println("Dzień: " + st1.nextToken());
        System.out.println("Miesiąc: " + st1.nextToken());
        System.out.println("Rok: " + st1.nextToken());


    }




}
