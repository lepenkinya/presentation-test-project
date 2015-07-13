import java.util.List;

public class SexDetector {

    public static void main(String[] args) {

        NameProvider provider = new NameProvider();
        Detector detector = new Detector();

        List<String> names = provider.getNames();
        for (int i = 0; i < names.size(); i++) {
            String name = names.get(i);
            Sex sex = detector.getFromName(name);
            System.out.println(sex);
        }
    }

}
