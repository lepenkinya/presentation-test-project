public class SexDetector {

    private static PersonProvider provider = new PersonProvider();

    public static void main(String[] args) {

        while (provider.hasNext()) {
            provider.next().sayHi();
        }

    }

    public static PersonProvider getPersonProvider() {
        return provider;
    }

    public static void setPersonProvider(PersonProvider prov) {
        provider = prov;
    }



}
