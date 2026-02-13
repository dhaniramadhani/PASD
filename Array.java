import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int mk;

        System.out.println("Program Menghitung IP Semester");
        System.out.println("================================");

        System.out.print("Jumlah Matkul: ");
        mk = s.nextInt();
        s.nextLine();

        String[] nama = new String[mk];
        String[] huruf = new String[mk];
        double[][] data = new double[mk][3];

        double tb = 0;
        double ts = 0;

        for(int i = 0; i < mk; i++){
            System.out.println("\nData ke-" + (i+1));

            System.out.print("Nama Matkul : ");
            nama[i] = s.nextLine();
            
            System.out.print("SKS         : ");
            data[i][0] = s.nextDouble();

            System.out.print("Nilai       : ");
            data[i][1] = s.nextDouble();
            s.nextLine();

            if (data[i][1] > 80) {
                huruf[i] = "A";
                data[i][2] = 4;
            } else if (data[i][1] > 73) {
                huruf[i] = "B+";
                data[i][2] = 3.5;
            } else if (data[i][1] > 65) {
                huruf[i] = "B";
                data[i][2] = 3;
            } else if (data[i][1] > 60) {
                huruf[i] = "C+";
                data[i][2] = 2.5;
            } else if (data[i][1] > 50) {
                huruf[i] = "C";
                data[i][2] = 2;
            } else if (data[i][1] > 39) {
                huruf[i] = "D";
                data[i][2] = 1;
            } else {
                huruf[i] = "E";
                data[i][2] = 0;
            }

            tb += data[i][0] * data[i][2];
            ts += data[i][0];
        }

        double ip = tb / ts;

        // ================= OUTPUT YANG SUDAH DIRAPIKAN =================

        System.out.println("\nHasil Konversi Nilai");
        System.out.println("==============================================================");
        System.out.printf("%-30s %-12s %-12s %-12s\n",
                "MK", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");
        System.out.println("==============================================================");

        for (int i = 0; i < mk; i++) {
            System.out.printf("%-30s %-12.2f %-12s %-12.2f\n",
                    nama[i],
                    data[i][1],
                    huruf[i],
                    data[i][2]);
        }

        System.out.println("==============================================================");
        System.out.printf("Total SKS : %.0f\n", ts);
        System.out.printf("IP        : %.2f\n", ip);

    }
}
