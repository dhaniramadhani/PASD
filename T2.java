 import java.util.Scanner;
public class T2 {
public static void inputJadwal (String[][] jadwal,int n, Scanner s ){
    for(int i = 0; i < n; i++){
        System.out.println("\n Data jadwal ke- "+(i+1));

        System.out.println("Nama Matkul: ");
        jadwal [i][0] = s.nextLine();

        System.out.println("Ruang : ");
        jadwal[i][1] =s.nextLine();

        System.out.println("Hari : ");
        jadwal[i][2] = s.nextLine();

        System.out.println("Jam : ");
        jadwal [i][3] = s.nextLine();
    }
}
public static void tampilkanS(String[][] jadwal, int n){
    System.out.println("\n=== DAFTAR JADWAL KULIAH ===");
    System.out.printf("%-3s %-20s %-15s %-10s %-15s\n",
    "No", "Mata Kuliah", "Ruang", "Hari", "Jam");
    System.out.println("---------------------------------------------------------------------");

    for(int i = 0; i < n ; i++){
                    System.out.printf("%-3d %-20s %-15s %-10s %-15s\n",(i+1),
                jadwal[i][0],jadwal[i][1],jadwal[i][2],jadwal[i][3]);
    }
}
public static void tampilHari(String[][] jadwal,int n,String hari){
    System.out.println("\n === Jadwal Hari"+hari+" ===");
    boolean ditemukan = false;

    for (int i = 0; i < n; i++){
        if (jadwal[i][2].equalsIgnoreCase(hari)) {
            System.out.println("Mata Kuliah : "+jadwal[i][0]);
            System.out.println("Ruang : "+jadwal[i][1]);
            System.out.println("Jam : "+jadwal[i][3]);
            System.out.println("-------------------------------");
            ditemukan = true;
        }
    }
    if (!ditemukan) {
        System.out.println("Tidak ada jadwal pada hari Tersebut.");
    }
}
public static void tampilkanMK(String[][] jadwal,int n,String namaMK){
    System.out.println("\n=== Jadwal Mata Kuliah: "+namaMK+" ===");
    boolean ditemukan = false;

    for(int i = 0; i < n; i++){
        if (jadwal[i][0].equalsIgnoreCase(namaMK)) {
            System.out.println("Hari : "+jadwal[i][2]);
            System.out.println("Ruang : "+jadwal[i][1]);
            System.out.println("Jam : "+jadwal[i][3]);
            System.out.println("----------------------------");
            ditemukan = true;
        }
    }
    if (!ditemukan) {
        System.out.println("Mata Kuliah tidak Ditemukan.");
    }
}
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.print("Masukan Jumlah Jadwal Kuliah: ");
        int n = Integer.parseInt(s.nextLine());

        String[][] jadwal = new String[n][4];
        inputJadwal(jadwal, n, s);
        tampilkanS(jadwal, n);

        System.out.println("\nMasukan Hari yang ingin Dicari: ");
        String cariHari = s.nextLine();
        tampilHari(jadwal, n, cariHari);

        System.out.print("\nMasukan nama Mata kuliah ingin dicari: ");
        String cariMK= s.nextLine();
        tampilkanMK(jadwal, n, cariMK);
    }
}


