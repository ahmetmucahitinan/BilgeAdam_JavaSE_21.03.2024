package Week02;

public class VariableUse {
    public static void main(String[] args) {
        int intNumber = 5;
        float floatNumber = 2.356f; // yanına f eklediğimizden dolayı float olur yoksa double olarak algılama yapar ve hata verir.
        long longNumber= 10000;
        boolean booleanCondition = true; //true yada false yazabiliriz sadece
        double doubleNumber = 2.356;
        char character = 'A'; // System.out.println((int)character);//(int)değeri olarak yazınca değerini yazar

        System.out.println((int)character);
    }
}
