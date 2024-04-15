package week05.diamondproblem;

public interface MyInterface01 {

    // default ayarlarda metodun acces modifier'ı public olduğu için gri gösteriyor
    public default void defaultMethod(){
        System.out.println("MyInterface01 defaultMethod");
    }

    //Interface'de varsayılan olarak bütün methodlar abstract gelir. O yüzden gri görünüyor
    abstract void test();
}
