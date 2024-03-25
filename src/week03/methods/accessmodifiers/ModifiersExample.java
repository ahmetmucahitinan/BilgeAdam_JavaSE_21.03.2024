package week03.methods.accessmodifiers;

public class ModifiersExample extends AccessLevel{
    public static void main(String[] args) {
        AccessLevel accessLevel = new AccessLevel();
        System.out.println(accessLevel.publicString()); // public her yerden erişilir
        System.out.println(accessLevel.protectedString()); //protected kalıtım alındığı durumda her yerden erişilir
        System.out.println(accessLevel.deafultString()); //aynı paket içerisinde olan sınıflardan erişilir
       // System.out.println(accessLevel.privateString());  // sadece sınıfın içerisinden erişilir.
    }
}
