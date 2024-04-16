package week05.supplier;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.function.Supplier;

public class SupplierTest03 {
    public static void main(String[] args) {

        LocalDate date = LocalDate.now(); // YYYY/MM/DD
        System.out.println(date);
        LocalDate date2 = LocalDate.ofEpochDay(0); //Localdate in başlangıç tarihi 01-01-1970 dir. Çünkü internetin başlangıç zamanından dolayıdır.
        System.out.println(date2);

// kanıtı
        long millis = 1713255055810l;
        long second = 1713255055810l/1000l;
        long minute = second/60;
        long hour = minute/60;
        long day = hour/24;
        LocalDate date3 = LocalDate.ofEpochDay(day);
//        System.out.println(date3);

        System.out.println("-----------------------------");

        // Tarih ve Zaman yöntem 1
        Supplier<String> currentDateTime = () -> LocalDateTime.now().toString();
        System.out.println(currentDateTime.get());

        // Tarih ve Zaman yöntem 2
        Supplier<LocalDateTime> supplier02 = LocalDateTime::now;
        LocalDateTime localDateTime = supplier02.get();
        System.out.println(localDateTime);

        // Tarih ve Zaman yöntem 3
        Supplier<String> supplier03 = () -> dtf.format(localDateTime.now());
        String localDateTimeFormatter = supplier03.get();
        System.out.println(localDateTimeFormatter);

    }
    private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");

}
