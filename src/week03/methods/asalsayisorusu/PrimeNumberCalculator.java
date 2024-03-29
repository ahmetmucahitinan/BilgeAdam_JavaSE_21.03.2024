package week03.methods.asalsayisorusu;

public class PrimeNumberCalculator {
    long number; /*
    long number dediğimiz değişken PrimeNumberCalculator sınıfının bir field'ı dır.
     long değişkeni veri türünü, number ise değişkene verdiğimiz ismi ifade eder
     Değişkeni veri türü herhangi bir primitive type yada herhangi bir class da olabilir.
            ÖR;   Scanner scanner = new Scanner(System.in);
            Buradaki veri türü soldaki "Scanner" class'ı dır. "scanner" ise bu oluşturduğumuz değişkene kodumuzda
            hangi isimle sesleneceğimizi belirtir. Sağ taraf ise atama operatörü (=) aracılığıyla değişkenimize
            atadığımız değeri barındırıyor.
            new Scanner(System.in) -> ifadesi aslında Scanner sınıfının bir yapıcı metodudur.
            Scanner yapıcı metodu içerisine System.in türünde bir parametre almadan benim için
            bir scanner nesnesi oluşturmuyor.

        Bir sınıf içerisinde sonsuz sayıda field/attribute değişken barındırabilir. Dikkat edilmesi gereken tek
        şey; bu fieldların isimlerinin birbiriyle çakışmamasıdır.

        Bir field yada sıradan bir metot nasıl isimlendirilir?
        İlk kelimenin başlangıç harfi küçük olmalı
        Sonrasında gelen her kelime için baş harfi büyük yazılmalıdır.
        Strin plakaNo; -> İlk sözcüğün ilk harfi küçük başlar, sonrasındaki bütün sözcükler büyük harfle yazılır.
        Bu sayede boşluk tuşu(space) kullanmadan kelimeleri birbirlerinden ayırt etmesi, okuması kolay olur.
        public int sayiTopla(int sayi1, int sayi2)
        -> Bu sıradan bir metod olduğu için (yani bir constructor metodu olmadığı için)
        isminin ilk harfi küçük harfle başlar.
 */

    /* Constructor:
    1 - Constructor metdounun ismi sınıfın ismiyle aynı olmalı. "PrimeNumberCalculator"
    2 - Parametreler için () uygulanmalı. Bu sayede metot olduğuda JVM tarafından anlaşılır.
    3 - Constructor metotlarında geri dönüş tipi olmadığı için normal metotların aksine bir geri dönüş
    tipi belirtilmez, dolayısıyla herhangi bir koşulda "return" de kullanılabilir.
    4 - Geri dönüş olmasa da, Access Modifier kullanabiliriz.
        4.1 - Access Modifierlarım ; public, private, protected, default
            4.1.1 - Access modifier public ise ilgili metod/field yada class'a projenin herhangi bir
            yerinden erişebilirim
            4.1.2 - Access modifier private ise ilgili metod ve field'a sadece ve sadece metod
            ve field'ın tanımlandığı sınıfta erişebilirim
            4.1.3 - Access modifier default ise (yani hiçbir şey belirtilmediyse - kendiliğinden default olur - )
            metod ve field'lara sadece bulundukları sınıf ile aynı pakette bulunan diğer sınıflar erişebilir.
            4.1.4 - Access modifier protected ise default özelliklerine ek olarak, kaıltım durumu var ise
            metod ve field'lara başka paketlerdeki sınıflardan da erişilebilir
    5 - Her metot da olduğu gibi, constructor metodunun da gövdesi "{ }" bulunmak zorundadır.
    6 - Constructor metodu sınıfın yapıcı metodudur, sınıfın bir nesnesini yaratmak için kullanılır.
    */

        /* Hiçbir şey yazmadığım için access modifier'ı default oldu. Dolayısıyla bu constructor metoduna
           sadece bu sınıfın bulunduğu pakette bulunan sınıflar erişebilir. */
    PrimeNumberCalculator(/*Parametre/Argüman kısmı burasıdır. Buraya String isim , int sayi gibi değerler gelir */){
        // Herhangi bir parametre girilmeyen constructorlara
        // NoArgsConstructor(Argümansız/Parametresiz) constructor denir.
    }
    PrimeNumberCalculator(long number) {
        /*Bu sınıfın bir nesnesi oluşturulurken dışarıdan bir sayının parametre olarak girilmesi durumunda,
         bu constructor çalışacaktır. Yukarıda parametre olarak aldığım number değişkenini bir alt satırda
         number isimli field'ıma değer olarak atıyorum. Bu şekilde olan constructorlara Parametreli Constructor
         (Parameterized Constructor) denir. Argüman alarak nesne üretmek için kullanılır.*/
        this.number=number; //buradaki this. ifadesi, sınıfın değişkeni olan number'a seslendiğimi ifade eder.
    }

    public/*access modifier*/ boolean/*geri dönüş tipi*/ asalSayiMi /*metot ismi*/()/*parametre alanı*/{/*Metot gövdesi*/
        if(number == 2){
            return true;
        } else if(number <2 || number%2 ==0){/*Birbirine bağlı, zincirleme karar yapısı için else-if kullandık.*/
            return false;
        } else {
            for (long i = 3; i< number/2;i+=2){
                if(number%i == 0){
                    System.out.println(i);

//                    System.out.println((number%i));
                    return false;
                }
            }
            return true;
        }
    }

    public boolean asalSayiMiOptimize (){
        long sqrt = (long) Math.sqrt(number);
        if(number == 2){
            return true;
        } else if(number <2 || number%2 ==0){/*Birbirine bağlı, zincirleme karar yapısı için else-if kullandık.*/
            return false;
        } else {
            for (long i = 3; i<= sqrt/2;i+=2){
                if(number%i == 0){
                    System.out.println(i);

//                    System.out.println((number%i));
                    return false;
                }
            }
            return true;
        }
    }
}