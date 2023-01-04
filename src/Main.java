public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int n = 3;
        int aufruf1 = RekursiverAufruf(n);
    }

    public static int RekursiverAufruf(int n) {
        int zaehler = 5;
        for (int i = 0; i < zaehler; i++) {
            int p = 25;
            int dings = RekursiverAufruf(n - 1);
            if (n == 1) {
                System.out.println("Ausgabe weil Rekusion");
            }
        }return zaehler;
    }
}