package week05.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionTest03 {
    /*
    Encapsulation kurallarına uygun bir Employee sınıfı oluşturalım.
    Her bir Employee ismi ve yaşı olsun.
    AllArgsConstructor üretelim.
     */
    public static void main(String[] args) {

    List<Employee> employeeList = new ArrayList<>();

    Function<Employee, String> employeeToStringName = e -> e.getName();
    Employee emp = new Employee("Ahmet", 20);
    Employee emp1 = new Employee("Tuba", 21);
    Employee emp2 = new Employee("Alperen", 28);
        System.out.println(employeeToStringName.apply(emp));
        System.out.println(employeeToStringName.apply(emp1));
        System.out.println(employeeToStringName.apply(emp2));

    }
}
