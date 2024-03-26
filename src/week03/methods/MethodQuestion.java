package week03.methods;

import week03.methods.staticmethods.Question;

import java.util.Scanner;

public class MethodQuestion {
    /*  Girilen bir tam sayının karesini alan bir method oluşturalım. Bu method non-static olsun.
  Daha sonra kullanıcıdan 2 adet sayı isteyelim. Bu sayılardan küçük olanından başlayarak büyük
   olan sayıya kadar aradaki bütün sayıların karesini metod yardımıyla alalım ve yazdıralım /*
   */
    public static void main(String[] args) {
        MethodQuestion methodQuestion = new MethodQuestion(); //MethodQuestion() --> constructor method
//        long square = methodQuestion.getSquare(5);
//        System.out.println("Sayının Karesi : "+square);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen 1. Sayıyı Giriniz : ");
        int num1 = scanner.nextInt(); //scanner.nextInt()+"/n" olduğu için nextLine() yaparız
        scanner.nextLine();
        System.out.print("Lütfen 2. Sayıyı Giriniz : ");
        int num2 = Integer.parseInt(scanner.nextLine()); //Integer.parseInt("\n")

       int min;
       int max;
       if (num1>num2){
           max= num1;
           min= num2;
       }else {
           max=num2;
           min=num1;
       }
       for (int i=min; i<=max; i++){
           System.out.println(methodQuestion.getSquare(i));
       }
//       min =  Math.min(num1,num2);
//       max =  Math.max(num1,num2);
//        System.out.println(min);
//        System.out.println(max);

    }
    public long getSquare(int number){
    return  (long) Math.pow(number,2); //Uzun vadede sayının karesi dışında daha fazla kuvvetini almak istediğimizde bu method daha uygun olacaktır.
//        return number*number;  //
    }
}
