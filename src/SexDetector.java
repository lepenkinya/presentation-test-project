import java.util.List;

public class SexDetector {

    public static void main(String[] args) {

        PersonProvider provider = new PersonProvider();

        List<Person> persons = provider.getPersons();

        for (Person person : persons) {
            String fullName = person.getFullName();
            System.out.println(fullName);
        }

    }

}
