package week03.arrays;

public class ArrayWithForeachLoops {
    public static void main(String[] args) {
        int[] ageArr = {12, 5, 14, 13};

        //foreach ile Array de gezinmek
        for (int x: ageArr){
            System.out.println(x+1);
        }
    }
}
