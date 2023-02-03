public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        //int n = 25;
        //int aufruf1 = RekursiverAufruf(n);
        int arraysAufruf = arrayTestaufruf.arraysTest();

    }

    public static int RekursiverAufruf(int n) {
        int zaehler = 5;
        if (n <= 1) {
            System.out.println("n ist kleiner als 1");
            return 1;
        } else {
            int dings = RekursiverAufruf(n - 1);
            System.out.println("n is: " + n);
            System.out.println("dings: " + dings);
            if (n == 2) {
                System.out.println("Ausgabe weil Rekusion");
            }
        }
        return zaehler;
    }

    public class arrayTestaufruf {
        public static int arraysTest() {
            int array1[] = new int[10];
            int array2[] = new int[10];
            int i;
            int j;
            int middleman = 10;
            int lanege = array2.length - 1;
            int printer = 0;
            for (i = 0; i < 10; i++) {
                array1[i] = i;

                for(j = lanege; j > -1;j--){
                array2[j] = array1[i];

                }
                lanege = lanege - 1;
            }
            for (int e: array1){
                System.out.println("Array1: " + e);
            }
            for(int f: array2){
                System.out.println("Array2: " + f);
            }
            return array1.length;
        }
    }
}