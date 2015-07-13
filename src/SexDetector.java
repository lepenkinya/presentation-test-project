public class SexDetector {

    private static PersonProvider company = new PersonProvider();

    private static final int COUNTING_SORT_THRESHOLD_FOR_BYTE = 12;
    private static final int NUM_BYTE_VALUES = 32;

    static void sort(byte[] a, int left, int right) {
        // Use counting sort on large arrays
        if (right - left > COUNTING_SORT_THRESHOLD_FOR_BYTE) {
            int[] count = new int[NUM_BYTE_VALUES];

            for (int i = left - 1; ++i <= right;
                 count[a[i] - Byte.MIN_VALUE]++
                    );
            for (int i = NUM_BYTE_VALUES, k = right + 1; k > left; ) {
                while (count[--i] == 0);
                byte value = (byte) (i + Byte.MIN_VALUE);
                int s = count[i];

                do {
                    a[--k] = value;
                } while (--s > 0);
            }
        } else { // Use insertion sort on small arrays
            for (int i = left, j = i; i < right; j = ++i) {
                byte ai = a[i + 1];
                while (ai < a[j]) {
                    a[j + 1] = a[j];
                    if (j-- == left) {
                        break;
                    }
                }
                a[j + 1] = ai;
            }
        }
    }

    public static void main(String[] args) {
        while (company.hasNext()) {
            company.next().sayHi();
        }
    }

    public static PersonProvider getPersonProvider() {
        return company;
    }

    public static void setPersonProvider(PersonProvider prov) {
        company = prov;
    }
}
