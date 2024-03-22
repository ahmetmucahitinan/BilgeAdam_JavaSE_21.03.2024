package Week02;

public class TypeCasting {
    public static void main(String[] args) {
        int dollar = 5;
        float dollarF = dollar;
        long dollarL = dollar; //Bu üç değişkenin değerini konsolda yazdırın

        //Hocanın çözümü
        System.out.println("int dollar : " +dollar
                +"\n float dollar : " + dollarF
                +"\n long dollar : " + dollarL);
        // Benim çözüm
//        System.out.println("int cinsinden: "+dollar);
//        System.out.println("Float cinsinden: "+dollarF);
//        System.out.println("Long cinsinden: "+dollarL);



//Narrowing Casting Mantığı uygulanan bir sorudur.
        float floatDollar = 13.5f;
        int intDollar = (int) floatDollar; //Float değişkenini int cinsinden konsola yazdırın

        System.out.println("Float Dollar : "+ floatDollar
                +"\nint Dollar : "+ intDollar);


        long longDollar = 24; // long cinsini int cinsinden konsola yazdırın
        int intDollar2 = (int)longDollar;

        long longValue = 1000000000000L;
        int intValue = (int) longValue;
        System.out.println(longValue);
        System.out.println(intValue);


        float number1 = 5.3f;  // Burada sum öncesi float olup = kısmı int olarak kalınca önce int olarak toplar sonra float cinsine çevirir
        int sum = (int) (number1 + 5);
        System.out.println(sum);
        String sum2 = String.valueOf(sum);
        System.out.println(sum2);
        System.out.println((sum2+10));
        System.out.println((sum+10));
    }
}
