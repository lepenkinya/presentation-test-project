public class SexDetector {

    public static void main(String[] args) {

        PersonProvider provider = new PersonProvider();

        while (provider.hasNext()) {
            provider.next().sayHi();
        }

    }

}
