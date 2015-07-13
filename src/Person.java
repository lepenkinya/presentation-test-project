import com.sun.istack.internal.Nullable;
import com.sun.xml.internal.ws.util.StringUtils;

public class Person {
    private final String name;

    public Person(String name) {
        this.name = name;
    }

    public void sayHi() {
        if (name == null) throw new NullPointerException();
        System.out.println(name + " : Hi!");
    }
}
