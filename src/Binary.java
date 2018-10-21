public class Binary {
    public static void main(String[] args) {


        int i = 5;
        System.out.println("dziesiętny: " + i);
        System.out.println("binarny: " + Integer.toBinaryString(i));
        System.out.println("ósemkowy: " + Integer.toOctalString(i));
        System.out.println("szesnastkowy: " + Integer.toHexString(i));


        int j = 123;
        System.out.println("dziesiętny: " + j);
        System.out.println("binarny: " + Integer.toBinaryString(j));
        System.out.println("ósemkowy: " + Integer.toOctalString(j));
        System.out.println("szesnastkowy: " + Integer.toHexString(j));


        int k = 0173;
        System.out.println("dziesiętny: " + k);
        System.out.println("binarny: " + Integer.toBinaryString(k));
        System.out.println("ósemkowy: " + Integer.toOctalString(k));
        System.out.println("szesnastkowy: " + Integer.toHexString(k));



        int a = 6;
        int b = 5;
        int c = calculate(a, b);
        show(a,b,c);

    }

    static void show(int a, int b, int c) {
        System.out.printf("%10s\n", Integer.toBinaryString(a));
        System.out.printf("%10s\n", Integer.toBinaryString(b));
        System.out.println("---------------");
        System.out.printf("%10s\n", Integer.toBinaryString(a & b));
        System.out.println(a & b);
        System.out.printf("%10s\n", Integer.toBinaryString(c));
        System.out.println(c);

    }

    static int calculate(int a, int b) {
        return a & b;
    }



    }

