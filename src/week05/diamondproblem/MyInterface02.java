package week05.diamondproblem;

public interface MyInterface02 {

    // default ayarlarda metodun acces modifier'ı public olduğu için gri gösteriyor
    public default void defaultMethod(){
        System.out.println("MyInterface02 defaultMethod");
    }

    //Interface'de varsayılan olarak bütün methodlar abstract gelir. O yüzden gri görünüyor
    abstract void test();
}
