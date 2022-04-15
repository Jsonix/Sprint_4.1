import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {

        if(name == null){
            return false;
        }

        Pattern symbolsPattern = Pattern.compile("^[\\S]+ [\\S]+$");
        Matcher symbolsMatcher = symbolsPattern.matcher(name);

        Pattern lengthPattern = Pattern.compile("^(.){3,19}$");
        Matcher lengthMatcher = lengthPattern.matcher(name);

        if (symbolsMatcher.find()){
            return lengthMatcher.find();
        }
        return false;
    }
}