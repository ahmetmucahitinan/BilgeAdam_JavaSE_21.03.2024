package week04.generics;

public class BoundedTypeExample {

    public static <T extends Number> void finMinMax(T[] array){
        if (array == null || array.length == 0){
            return;
        }
        T min = array[0];
        T max = array[0];

        for (T element : array){
            if (element.doubleValue() < min.doubleValue()){
                min = element;
            }
            if (element.doubleValue() > max.doubleValue()) {
                max = element;
            }
        }
        System.out.println("Min : " + min);
        System.out.println("Max : " + max);
    }

    public static void main(String[] args) {
        Integer[] intArr = {1, 3, 5, -15, 75, 16};
        Double[] doubleArr = {3.1, 1.3, 77.123, -16.2332, 100.13};
//        String[] nameArr = {"Ali", "Ayşe", "Mehmet", "Ahmet", "Ferdi", "Fatma"};
// -> Çalışmaz. Çünkü T extends Number yaptığımız için ve min ve max üzerindeki doubleValue() veri türü
// sadece Number veri türüne özeldir. String veri türünde çalışmaz

        System.out.println("Integer Array");
        finMinMax(intArr);

        System.out.println("Double Array");
        finMinMax(doubleArr);
    }
}
