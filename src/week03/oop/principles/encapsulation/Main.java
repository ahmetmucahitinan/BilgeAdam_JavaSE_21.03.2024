package week03.oop.principles.encapsulation;

public class Main {
    public static void main(String[] args) {

        Person p1 = new Person();
        p1.setName("Ahmet Mücahit");
        p1.setLastname("Marka");
        p1.setAge(19);
        p1.setTcKimlik("12345678910");
        System.out.println("İsim : "+p1.getName()
                +"\nSoy İsim : "+p1.getLastname()
                + "\nYaş : "+p1.getAge()
                + "\nTc Kimlik : " + p1.getTcKimlik());//person.java da getTcKimlik kısmını silersem görüntüleyemem ve kırmızı yanar
        System.out.println();
    }

}
