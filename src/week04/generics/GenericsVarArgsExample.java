package week04.generics;

public class GenericsVarArgsExample {

    //TODO --> ÖDEV: Farklı türlerde oyuncu nesneleri oluşturun ve teams sınıfını kullanarak bir takım oluşturun.
    // Takıma oyuncuları ekleyin ve takımdan oyuncuları listeleyin

    //TODO --> ÖDEV: WeakHashMap, EnumMap ve EnumSet, StateDesignPatter, BuilderDesignPatter, ObserverDesignPatter,
    // SingleTonDesignPatter, FactoryDesignPatter Araştırıp öğrenin ve bunlarla ilgili örnek kod yazınız.

    public static <T> void printArray(T... items){
        for (T item : items){
            System.out.print(item + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("String Dizisi ");
        printArray("Merhaba", "Dünya", "Java");

        System.out.println("Integer Dizisi ");
        printArray(1, 2, 3, 4, 5, 6, 7);

        System.out.println("Double Dizisi ");
        printArray(3.14, 9.80, 2.718);
    }
}
