
import org.jetbrains.annotations.Nullable;

import java.util.Arrays;
import java.util.List;

public class PersonProvider {

    private List<Person> persons = Arrays.asList(
            new Person("Anna"),
            new Person("Alexey"),
            new Person("Vasiliy"),
            new Person("Nikolay"),
            new Person(null /* No name, sorry   */)
    );

    private int index = 0;

    public boolean hasNext() {
        return index < persons.size();
    }
    
    @Nullable
    public Person next() {
        return persons.get(index++);
    }


}
