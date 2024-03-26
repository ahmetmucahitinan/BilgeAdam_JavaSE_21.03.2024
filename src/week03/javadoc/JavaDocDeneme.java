package week03.javadoc;

public class JavaDocDeneme {
    // Bilgilendirme mesajı gibi. Kendime not tutabilirim.
    // ctrl+ / bir arada basarak çoklu satırı yorum satırı haline getirebilirim.
    // TODO -> Yapılacaklar listesi gibi calisir. Projede TODO ile
    //  işaretlenmiş bütün yorumlar ayrıca görüntülenebilir. Proje üzerine herkesin görebileceği,gözden
    //  kaçmaması gereken mutlaka halledilmesi gereken şeyler için not almakta rahatlıkla kullanılabilir.

    /*
        Yorum bloğu. Bunun içerisinde de
    */
    private /* buraya istediğim şeyi yazabilirim ve bu kodun çalışmasına engellemez*/ long getSquare(int number) {
        return (long) Math.pow(number, 2);
    }
    /**
     *  -> javaDoc blogu
     * @param number
     * @return returns the square of the number
     */
}
