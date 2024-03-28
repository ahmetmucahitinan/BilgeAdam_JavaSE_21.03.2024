package week03.garbagecollector;

public class TestGarbage1 {
    public void finalize(){
        System.out.println("object is garbage collected");
    }
    public static void main(String[] args) {
        TestGarbage1 garbage1 = new TestGarbage1();
        /*  Bunlar Heapte ayrı yerde tutuluyolar  */
        TestGarbage1 garbage2 = new TestGarbage1();

        TestGarbage1 garbage3 = new TestGarbage1();
        /* Bunlar heapte aynı nesneyi referans alıyorlar. */
        TestGarbage1 garbage4 = garbage3;

        garbage1 = null;
        garbage2 = null;
        garbage3 = null;
        garbage4 = null; // bunun çöpü yoktur. Çünkü değerini garbage3'ten alıyor.
        //Yani garbage3 ve garbage4 heap'te aynı değere referanslanmıştır.
        new TestGarbage1();
    System.gc();
    }
}
