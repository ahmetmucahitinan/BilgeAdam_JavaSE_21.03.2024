package week05.function;

public class Employee {

    //FunctionTest03 sorusunun class'ı
    private String name;
    private Integer age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Employee() {
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
