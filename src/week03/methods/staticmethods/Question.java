package week03.methods.staticmethods;

import java.util.Scanner;

public class Question {
  /*  Girilen bir tam sayının karesini alan bir method oluşturalım. Bu method non-static olsun.
  Daha sonra kullanıcıdan 2 adet sayı isteyelim. Bu sayılardan küçük olanından başlayarak büyük
   olan sayıya kadar aradaki bütün sayıların karesini metod yardımıyla alalım ve yazdıralım /*
   */
  public static void main(String[] args) {
    Question question = new Question();

  }
  public long getSquare(int number){
//    return  (long) Math.pow(number,2);
    return number*number;



  }
}
