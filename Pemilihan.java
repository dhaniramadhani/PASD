import java.util.Scanner;
public class Pemilihan {



    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double tugas,kuis,uts,uas;

        System.out.println("Program Menghitung Nilai Akhir");

        System.out.println("Masukan Nilai Tugas:");
        tugas = s.nextDouble();
        
        System.out.println("Masukan Nilai Kuis:");
        kuis = s.nextDouble();

        System.out.println("Masukan Nilai UTS:");
        uts = s.nextDouble();
        
        System.out.println("Masukan Nilai Uas:");
        uas = s.nextDouble();

        System.out.println("=============================");

        if (tugas < 0 || tugas > 100 ||
            kuis < 0 || kuis > 100 || 
            uts < 0 || uts > 100 ||
            uas < 0 || uas > 100 
        ) {
            System.out.println("Nilai Tidak valid");
            System.out.println("==================");
            return;
        }
        double na = (0.2*tugas)+(0.2*kuis)+(0.3*uts)+(0.3*uas);
        
        String nh;
        String k;

        if (na > 80 && na <= 100) {
            nh = "A";
        }else if (na > 73) {
            nh = "B+";
        }else if (na > 65) {
            nh = "B";
        }else if (na > 60) {
            nh = "C+";
        }else if (na > 50){
            nh = "C";
        }else if (na > 39) {
            nh = "D";
        }else{
            nh = "E";
        }
if (nh.equals("A") || nh.equals("B+")
    || nh.equals("B")|| nh.equals("C+")
    || nh.equals("C")) {
        k = "Selamat Anda Lulus!!!!";
}else{
    k = "Selamat Anda Tidak Lulus :')";
}
System.out.println("Nilai Akhir : "+ na);
System.out.println("Nilai Huruf : "+nh);
System.out.println("======================");
System.out.println(k);
    }
    
}


