public class Detector {

    public Sex getFromName(String name) {
        if (name.endsWith("a")) {
            return Sex.FEMALE;
        }
        else {
            return Sex.MALE;
        }
    }

}
