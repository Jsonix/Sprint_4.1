public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {
        int nameLength = name.length();
        int spaceCount = nameLength - name.replaceAll(" ", "").length();

        if (nameLength > 19 || nameLength < 3){
            return false;
        } else if (name.startsWith(" ") || name.endsWith(" ")){
            return false;
        } else if (spaceCount != 1){
            return false;
        } else {
            return true;
        }
    }
}