package day4;

public class TypeCastingDemo {

    public static void main(String[] args) {
        //by computer
        byte b1 = 127;
        int i1 = b1; //implict casting or conversion
        System.out.println(b1);
        System.out.println(i1);

        int i2 = 127;
        //by java programmer
        byte b2 = (byte) i2; //explicit type casting (conversion)
        System.out.println(i2);
    }
}




