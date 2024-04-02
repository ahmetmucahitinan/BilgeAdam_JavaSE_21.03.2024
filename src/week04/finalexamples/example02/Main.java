package week04.finalexamples.example02;

public class Main extends FinalMethodExample02 {

//    public final void display(String name){
//        System.out.println("This is a display method");
//    } -> overload ederek kullanabiliriz

//    @Override
//    public final void display(S){
//        System.out.println("This is a display method");
//    } -> Bunu kullanmama izin vermez. Çünkü method superclass'ta final olarak tanımlanmış.
    @Override
    public void sayHello() {
        System.out.println("Hello Java Class");
    }
}
