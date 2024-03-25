package week03.methods;

public class VoidMethods {
    public static void main(String[] args) {
        //Kaliteli , gerçek yazılımcı yöntemi(OG)
        sayHello("Bilgeadam");
        sayHello("ahmet mücahit");
        methodRankPoints(270.5);
        methodRankPoints(110);

//        Kötü kalitesiz yöntem
//        String username1 = "Bilgeadam";
//        String username2 = "ahmet mücahit";
//        System.out.println("Merhaba "+username1.toUpperCase()+ "! Hoş Geldin!");
//        System.out.println("Merhaba "+username2.toUpperCase()+ "! Hoş Geldin!");
    }
    private static void sayHello(String username){
        System.out.println("Merhaba "+username.toUpperCase()+ "! Hoş Geldin!");
    }
    public static void methodRankPoints(double points){
        if (points>=202.5){
            System.out.println("Rank : A1 ");
        } else if (points>=122.4) {
            System.out.println("Rank : A2 ");
        }else {
            System.out.println("Rank : A3 ");
        }
    }
}
