public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int n = 25;
        int aufruf1 = RekursiverAufruf(n);
    }

    public static int RekursiverAufruf(int n) {
        int zaehler = 5;
        if(n <= 1) {
            System.out.println("n ist kleiner als 1");
            return 1;
        }else {
            int dings = RekursiverAufruf(n - 1);
            System.out.println("n is: " + n);
            System.out.println("dings: " + dings);
            if (n == 2) {
                System.out.println("Ausgabe weil Rekusion");
            }
        }return zaehler;
    }
}