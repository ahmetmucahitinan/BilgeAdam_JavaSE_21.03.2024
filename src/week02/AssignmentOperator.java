package week02;

public class AssignmentOperator {
    public static void main(String[] args) {
        byte byteNumber = 126;
        short shortNumber = 327;
        int intNumber = 1058;
        long longNumber = 12042;
        float floatNumber = 42.8f;
        double doubleNumber = 8.58;
        char character = 'A';
        boolean booleanCondition = true;

        //Referans veri tipleri (String ile sınırlı);
        String myText = "Merhaba ! ", myWeb = "www.bilgeadam.com";

        //Ekrana yazdırma komutları:
        System.out.println(myText +
                "\n Byte Değeri:" + byteNumber +
                "\n Short Değeri" + shortNumber +
                "\n Integer Değeri:" + intNumber +
                "\n Long Değeri: " + longNumber +
                "\n Float Değeri: " + floatNumber +
                "\n Double Değeri: " + doubleNumber +
                "\n Char Değeri: " + character +
                "\n Boolean Değeri: " + booleanCondition);
        System.out.println(myWeb);
    }
}
