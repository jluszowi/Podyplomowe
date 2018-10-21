public class Casting {
    public static void main(String[] args) {

        double d = 4.45;
        int i;
        i = (int)d;

        System.out.println(i);


        double e = 4.45;
        short s = 8;
        int f;
        f = s;


        System.out.println(f);

        Employee emp = new Employee();
        VicePresident veep = new VicePresident();

        emp = veep;

        veep = (VicePresident) emp;


        Float f1 = 4.23F;
        Float f2 = 6.34F;

        System.out.println(Math.min(f1,f2));


        Short se = 3;





    }

}


class Employee {}
class  VicePresident extends Employee {}





