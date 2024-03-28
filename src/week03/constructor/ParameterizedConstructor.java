package week03.constructor;

/* Ad, soyad, yaş ve cinsiyet fieldlarını belirleyelim. Sonrasında bu sınıfın 2 adet nesnesini oluşturalım.
*Bu nesnelerin yaş ve cinsiyet değerleri, constructor parametresinden, oluşturma anında verilsin. Diğer
* iki değeri elle girelim.*/
public class ParameterizedConstructor {
    String name;
    String surname;
    int age;
    String gender;

    ParameterizedConstructor(int age, String gender){
        //İsim çakışması olacağı için "this" anahtar kelimesini kullanarak
        // sınıfımın field'ı olan age'e erişebileceğimi belirtiyorum
        this.age = age;
        this.gender = gender;
    }

    public static void main(String[] args) {
        ParameterizedConstructor obj1 = new ParameterizedConstructor(20,"Erkek");
        ParameterizedConstructor obj2 = new ParameterizedConstructor(22,"Kadın");
        obj1.name = "Ahmet Mücahit";
        obj1.surname =  "Marka";

        obj2.name = "Tuba";
        obj2.surname = "Kalite";

        System.out.println("Kişinin Adı : " + obj1.name);
        System.out.println("Kişinin Soyadı : " + obj1.surname);
        System.out.println("Kişinin Yaşı : " + obj1.age);
        System.out.println("Kişinin Cinsiyeti : " + obj1.gender);

        System.out.println();

        System.out.println("Kişinin Adı : " + obj2.name);
        System.out.println("Kişinin Soyadı : " + obj2.surname);
        System.out.println("Kişinin Yaşı : " + obj2.age);
        System.out.println("Kişinin Cinsiyeti : " + obj2.gender);

    }
}
