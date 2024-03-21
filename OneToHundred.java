public class OneToHundred{

    public static void main(String[] args) {
        int i;

        // For
        for (i = 1; i <= 100; i++) {
            System.out.println(i);
        }

        // While
        i = 1;
        while (i <= 100) {
            System.out.println(i);
            i++;
        }

        // Do While
        i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i <= 100);
    }
}
