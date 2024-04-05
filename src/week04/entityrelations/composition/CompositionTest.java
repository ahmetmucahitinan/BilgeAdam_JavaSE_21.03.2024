package week04.entityrelations.composition;

public class CompositionTest {
    public static void main(String[] args) {
        CompositeEmployee compositeEmployee = new CompositeEmployee(1, "Ahmet Mücahit","2037", "Ankara");
        System.out.println(compositeEmployee);

        // AggragateEmployee ile compositeEmployee arasındaki fark Adress sınıfını compositeEmployee 'nin
        // içerisinde oluşturuluyor. AggregateEmployee' de farklı bir sınıf üzerinden oluşturularak bağlanıyor.
        // Hatta compositionEmployee de artık aynı sınıf içerisinde yer aldığı için constructor'ın içerisine
        // tanımlarken String street, String city olarak tanımlıyoruz.
    }
}
