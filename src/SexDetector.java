import java.util.List;

public class SexDetector {

    public static void main(String[] args) {

        NameProvider provider = new NameProvider();
        Detector detector = new Detector();

        List<String> names = provider.getNames();
        names.forEach((name) -> {
            Sex detected = detector.getFromName(name);
            System.out.println(detected);
        });
    }

}
