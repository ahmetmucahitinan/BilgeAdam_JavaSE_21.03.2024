package week02;

public class LogicalOperator {
    public static void main(String[] args) {
        String username = "ahmetmucahitinan";
        int password = 123456;

        System.out.println(username.equals("ahmetmucahitinan"));
        System.out.println(username.equals("ahmetmucahit"));
        System.out.println(password == 123456);
        System.out.println(password == 0123456);

        //Koşullar yapısını anlatırken if-else kavramını daha detaylı değinilecek
        if (username.equals("ahmetmucahitinan") && password==123456){ //equals yerine equalsIgnoreClass yazınca büyük veya küçük karakterin önemini kaldırır.
            System.out.println("Giriş Başarılı");
        }
        int character = 'A';
        int character2 = 'a';

        System.out.println(character + "\t"+ character2);
    }
}
