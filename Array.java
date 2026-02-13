
import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Program Menghitung IP Semester");
        System.out.println("================================");

        System.out.print("Jumlah Matkul: ");
        int mk = s.nextInt();
        s.nextLine();

        String[] nama = new String[mk];
        String[] huruf = new String[mk];
        double[][] data = new double[mk][3]; 

        double totalBobot = 0;
        double totalSKS = 0;

        for(int i = 0; i < mk; i++){

            System.out.print("masukkan nilai Angka untuk MK ");
            nama[i] = s.nextLine();
            System.out.print(": ");
            data[i][1] = s.nextDouble();

            System.out.print("masukkan jumlah SKS untuk MK ");
            s.nextLine();
            System.out.print(nama[i] + ": ");
            data[i][0] = s.nextDouble();
            s.nextLine();

          
            if (data[i][1] > 80) {
                huruf[i] = "A";
                data[i][2] = 4.00;
            } else if (data[i][1] > 73) {
                huruf[i] = "B+";
                data[i][2] = 3.50;
            } else if (data[i][1] > 65) {
                huruf[i] = "B";
                data[i][2] = 3.00;
            } else if (data[i][1] > 60) {
                huruf[i] = "C+";
                data[i][2] = 2.50;
            } else if (data[i][1] > 50) {
                huruf[i] = "C";
                data[i][2] = 2.00;
            } else if (data[i][1] > 39) {
                huruf[i] = "D";
                data[i][2] = 1.00;
            } else {
                huruf[i] = "E";
                data[i][2] = 0.00;
            }

            totalBobot += data[i][0] * data[i][2];
            totalSKS += data[i][0];
        }

        double ip = totalBobot / totalSKS;


        System.out.println("\nhasil Konversi Nilai");
        System.out.println("===============================================");
        System.out.printf("%-35s %-12s %-12s %-12s\n",
                "MK", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");
        System.out.println("===============================================");

        for (int i = 0; i < mk; i++) {
            System.out.printf("%-35s %-12.2f %-12s %-12.2f\n",
                    nama[i],
                    data[i][1],
                    huruf[i],
                    data[i][2]);
        }

        System.out.println("===============================================");
        System.out.printf("\nIP : %.2f\n", ip);
    }
}


