package week02;

public class SingleOperator {
    public static void main(String[] args) {
        // Değişken Tanımlaması:
        int number1 = 87, number2 = 13;
        boolean condition = true;

        // Ön arttırma ve Azaltma Operatörü
        System.out.println("(A) Değeri: "+ number1 + "\t(++A) Değeri: "+(++number1));
        System.out.println("(B) Değeri: "+ number2 + "\t(--B) Değeri: "+(--number2));

        //Sonraki Artış ve Azaltma Operatörü
        System.out.println("(A) Değeri: "+ number1 + "\t(--A) Değeri: "+(--number1));
        System.out.println("(B) Değeri: "+ number2 + "\t(++B) Değeri: "+(++number2));

        //Mantıksal Değil Operatörü
        System.out.println("Değil (!): "+!condition);
    }
}
