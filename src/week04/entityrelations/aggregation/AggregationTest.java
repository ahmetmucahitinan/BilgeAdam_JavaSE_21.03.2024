package week04.entityrelations.aggregation;

public class AggregationTest {
    public static void main(String[] args) {
//        Adress adress = new Adress("2037", "Ankara");
//        System.out.println(adress);

        AggregateEmployee employee = new AggregateEmployee(1,"Ahmet Mücahit", new Adress("2037","Ankara"));
        System.out.println(employee);
    }
}
