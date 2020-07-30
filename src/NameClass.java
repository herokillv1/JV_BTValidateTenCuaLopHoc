import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NameClass {
    private static Pattern pattern;
    private Matcher matcher;

    private static final String NAME_CLASS = "^[C,A,P]+[0-9]{4}+[G, H, I, K, L, M]";

    public NameClass(){
    }

    public boolean validate(String regex){
        pattern = Pattern.compile(NAME_CLASS);
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }

}
