import java.util.Arrays;
import java.util.List;

public class PersonProvider {

    public List<Person> getPersons() {
        return Arrays.asList(
                new Person("Anna"),
                new Person("Alexey"),
                new Person("Vasiliy"),
                new Person("Nikolay"),
                new Person(null)
        );
    }

}
