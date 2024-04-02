package week04.finalexamples.example03;

public class Main {
    public static void main(String[] args) {
       final Person person = new Person("Ahmet Mücahit");
        person.setAge(10);
        System.out.println(person.getName() + " " + person.getAge());
//        person = new Person("Mert"); -> final olduğu için person'a yeni person değeri atanamaz
    }
}
