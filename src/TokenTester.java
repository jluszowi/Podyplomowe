import java.util.StringTokenizer;

public class TokenTester {
    public static void main(String[] args) {
        StringTokenizer st1, st2;

        String quotel = "GOOG 530, 80 -9,98";
        st1 = new StringTokenizer(quotel);

        System.out.println("Token 1: " + st1.nextToken());
        System.out.println("Token 2: " + st1.nextToken());
        System.out.println("Token 3: " + st1.nextToken());

        System.out.println("----------------");

        String quote2 = "RHT@75,00@0,22";
        st2 = new StringTokenizer(quote2, "@");

        System.out.println("Token 1: " + st2.nextToken());
        System.out.println("Token 2: " + st2.nextToken());
        System.out.println("Token 3: " + st2.nextToken());



    }
}
