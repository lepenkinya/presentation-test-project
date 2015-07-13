import com.sun.xml.internal.ws.util.StringUtils;

public class Person {
    private final String name;

    public Person(String name) {
        this.name = name;
    }

    public String getFullName() {
        return StringUtils.capitalize(name);
    }
}
