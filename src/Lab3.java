public class Lab3 {
    public static void main(String[] args) {

        int m = 555;
        System.out.println("dziesiętny: " + m);
        System.out.println("binarny: " + Integer.toBinaryString(m));
        System.out.println("ósemkowy: " + Integer.toOctalString(m));
        System.out.println("szesnastkowy: " + Integer.toHexString(m));

    }
}