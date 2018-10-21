public class Zad3 {
    public static void main(String[] args) {


        C c1 = new C();
        C c2 = new C();
        System.out.println("Stworzono " + C.counter + " obiektów");
        C c3 = new C();
        C c4 = new C();
        C c5 = new C();

        System.out.println("Stworzono " + C.counter + " obiektów");
    }

}

    class C {
    static int counter;

       public C(){
           counter++;
        }
    }
