package week03.arrays;

public class ArrayQ1 {
    public static void main(String[] args) {
        // (2, -9,0,5,12,-25,22,9,8,12) sayılarını bir dizi içerisine tanımlayınız.Daha sonra foreach/for
        // kullanarak toplamını bulup ekrana yazdıran ve sonrasında ise ortalamasını hesaplayan ekrana
        //yazdıran java kodunu yazınız
        int[] numberArr = {2, -9,0,5,12,-25,22,9,8,12};
        int toplam=0;
        double oran=0;
        for (int number:numberArr){
              toplam = toplam+number; //toplam+=number da yazılabilir
              oran = ((double)toplam/numberArr.length);
        }
                System.out.println("Dizideki Sayıların Toplamı: "+toplam);
                System.out.println("Dizideki Sayıların Ortalaması: "+oran);

                toplam=0;
                oran=0;
                for (int i=0; i<numberArr.length;i++){
                    toplam+=numberArr[i];
                    oran = ((double)toplam/numberArr.length);
                }
        System.out.println("Dizideki Sayıların Toplamı: "+toplam);
        System.out.println("Dizideki Sayıların Ortalaması: "+oran);
    }
}
