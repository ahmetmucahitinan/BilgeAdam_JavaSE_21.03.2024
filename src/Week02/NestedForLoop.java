package Week02;

public class NestedForLoop {
    public static void main(String[] args) {
        //Birinci (ust) döngü
        for (int i=1; i<=10; i++){
        //İkinci (alt) döngü
            for (int j=1; j<=10;j++){
                System.out.println(i + " x " + j +  "=" +(i*j));
            }
        }
    }
}
