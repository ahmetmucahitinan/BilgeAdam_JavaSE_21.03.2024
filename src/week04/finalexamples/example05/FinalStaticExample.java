package week04.finalexamples.example05;

public class FinalStaticExample {
    private static final String COLON = ":";
    private static final String COMMA = ",";
    private static final String  DOT = ".";

    public static void main(String[] args) {
        String uuid = "1231245";
        String request = "1231245";
        System.out.println("String contact");
        System.out.println(uuid.concat(COLON).concat(request));

        System.out.println("String builder");
        StringBuilder sb = new StringBuilder();
        System.out.println(sb.append(uuid).append(COLON).append(request));

        String programmingLang = "Java, .NET, Python";
        String[] programmingLanArr = programmingLang.split(COMMA);
        for (String lang : programmingLanArr){
            System.out.println(lang);
        }
    }
}
