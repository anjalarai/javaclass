package day3;

public class OperatorsDemo5 {

    public static void main(String[] args) {

        //Logical Operators
        //&& (and) ||(or) !(not)

        System.out.println(true && true); //t
        System.out.println(true && false); //f
        System.out.println(false && false); //f
        System.out.println(false && true); //f

        System.out.println("===============");

        System.out.println(true || true); //t
        System.out.println(true || false); //t
        System.out.println(false || false); //f
        System.out.println(false || true); //t


        System.out.println("===============");
        System.out.println(!true); //f
        System.out.println(!false ); //t

    }
}
