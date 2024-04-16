package week05.supplier;

import java.util.Optional;

public class SupplierTest05 {
    private static String staticName = "static name";

    public static void main(String[] args) {
        Optional<String> name = findNameById(1L); // Buradaki değer değiştirilince ekrana değer var veya yok durumunu belirler
        if (name.isEmpty()){
            System.out.println("Girdiğiniz id'li kullanıcı bulunamadı");
            System.exit(1);
        }
        System.out.println(name);

        String name2 = findNameById(2L).orElseGet(() -> staticName);
        System.out.println(name2);
    }
    private static Optional<String> findNameById(Long id){
        String name = null;
        if (id == 1L){
            name = "Java";
        }
        return  Optional.ofNullable(name);
    }
}
