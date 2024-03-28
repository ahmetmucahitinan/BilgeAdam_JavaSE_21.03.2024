package week03.constructor;

/* Bu sınıfın içerisinde isim, soyisim ve ülke fieldları olsun. Üke field'ını içeriden atayan bir
* parametresiz constructor oluşturalım.
* Ülke değeri bir nesne oluşturulması durumunda direkt olarak "Türkiye" değerini alalım
* Sonrasında bu 3 sınıftan 3 adet nesne üretip, isim,soyisim bilgilerini doldurup, ülkelerinin konsol
* çıktılarını alalım */
public class NoArgsConstructor {
    String isim;
    String soyisim;
    String ulke;
   public NoArgsConstructor(){ //private olursa main.java class'ında NoArgsConstructor hata verir.
        ulke = "Türkiye";
    }
    public static void main(String[] args) {
        NoArgsConstructor nesne1 = new NoArgsConstructor();
        nesne1.isim = "Ahmet Mücahit";
        nesne1.soyisim = "Marka";


        NoArgsConstructor nesne2 = new NoArgsConstructor();
        nesne2.isim = "Tuba";
        nesne2.soyisim = "Kalite";


        NoArgsConstructor nesne3 = new NoArgsConstructor();
        nesne3.isim = "Gamze";
        nesne3.soyisim = "Farketmez";

        System.out.println("Kişinin Adı : " + nesne1.isim);
        System.out.println("Kişinin Soyadı : " + nesne1.soyisim);
        System.out.println("Kişinin ülkesi : " + nesne1.ulke);
        System.out.println();
        System.out.println("Kişinin Adı : " + nesne2.isim);
        System.out.println("Kişinin Soyadı : " + nesne2.soyisim);
        System.out.println("Kişinin ülkesi : " + nesne2.ulke);
        System.out.println();
        System.out.println("Kişinin Adı : " + nesne3.isim);
        System.out.println("Kişinin Soyadı : " + nesne3.soyisim);
        System.out.println("Kişinin ülkesi : " + nesne3.ulke);
    }
}
