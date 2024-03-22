package Week02;

public class ForEachLoop {
    public static void main(String[] args) {
        //declaration, initilization
        int arr[] = {12,23,44,56,78};//alt +8, alt+9
        for (int i:arr){
            int sum = i+10;
            if (i<15){
                System.out.println("50'den küçük ");
            }else{
                System.out.println("50'den büyük");
            }
            System.out.println("+10 eklenmiş hali: "+sum);
        }
    }
}
