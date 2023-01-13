package Com.Syntax.Syntax.review2;

public class Casting_1 {
    public static void main(String[] args) {

        /*
        Casting - convert 1 datatype into another
        1. widening/implicit/automatic
        (byte -> short -> int -> long -> float -> double)
        2. narrowing/explicit/manual
        (double -> float -> long -> int -> short -> byte)
         */

        // widening گسترده شدن
        double d=5;
        System.out.println(d); // 5.0

        //narrowing باریک شدن
        int i=(int)5.0;
        System.out.println(i);

        byte b=(byte)128; //byte is always less than 128 (byte:=<127)
        System.out.println(b);




    }
}
