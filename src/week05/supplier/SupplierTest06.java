package week05.supplier;

import java.util.Optional;
import java.util.function.Supplier;

public class SupplierTest06 {
    public static void main(String[] args) {
    Employee employee = findNameById(1L)
            .orElseGet(
                    () -> factory(
                            () -> new Employee(2, "Muhammed",1979)
                    )
            );
        System.out.println(employee.toString());
    }
    public static Employee factory (Supplier<? extends Employee> s){
        Employee employee = s.get();
        return employee;
    }
    public static Optional<Employee> findNameById(Long id){
        Employee employee;
        if (id == 1){
            employee = factory(() -> new Employee(1L,"Ahmet", 21));
        }else {
            employee = null;
        }
        return  Optional.ofNullable(employee);
    }
}
