package week03.methods.accessmodifiers;

public class AccessLevel {
    public String publicString(){
        return "public string";
    }
    private String privateString(){
        return "private string";
    }
    protected String protectedString(){
        return "protected string";
    }
    String deafultString(){
        return "default string";
    }
}
