package week04.finalexamples.example04;

// public class Main extends FinalClassExample{  -> Bunu yapamayız. Final bir sınıf extend kabul edilemez.
// Kalıtımda kullanılamaz
public class Main {
    public static void main(String[] args) {
        FinalClassExample finalClassExample = new FinalClassExample();
        finalClassExample.display();
    }
}
