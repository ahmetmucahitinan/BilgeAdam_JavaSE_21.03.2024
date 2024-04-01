package week04.interfaceexamples.example02;

public class ProgrammingLanguage implements Language{

    @Override
    public void getName(String name) {
        System.out.println("Programming Language : " + name);
    }
}
