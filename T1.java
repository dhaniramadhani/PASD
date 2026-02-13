import java.util.Scanner;
public class T1 {
    public static boolean cocokkanK(char[] kodeBaris, String inputKode) {
        if (inputKode.length() > kodeBaris.length) {
            return false;
        }
        for (int j = 0; j < inputKode.length(); j++) {
            if (kodeBaris[j] != inputKode.charAt(j)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

         char[][] kode = {
            {'A', 'B', 'A', 'N', 'T', 'E', 'N'},
            {'B', 'J', 'A', 'K', 'A', 'R', 'T', 'A'},
            {'D', 'B', 'A', 'N', 'D', 'U', 'N', 'G'},
            {'E', 'C', 'I', 'R', 'E', 'B', 'O', 'N'},
            {'F', 'B', 'O', 'G', 'O', 'R'},
            {'G', 'P', 'E', 'K', 'A', 'L', 'O', 'N', 'G', 'A', 'N'},
            {'H', 'S', 'E', 'M', 'A', 'R', 'A', 'N', 'G'},
            {'L', 'S', 'U', 'R', 'A', 'B', 'A', 'Y', 'A'},
            {'N', 'M', 'A', 'L', 'A', 'N', 'G'},
            {'T', 'T', 'E', 'G', 'A', 'L'}
        };

        String[] kota = { 
            "Banten",
            "Jakarta",
            "Bandung",
            "Cirebon",
            "Bogor",
            "Pekalongan",
            "Semarang",
            "Surabaya",
            "Malang",
            "Tegal",
        };
        System.out.println("Masukan Kode Plat Nomor:  ");
        String inputK = s.nextLine().toUpperCase().trim();

        boolean ketemu = false;

        for (int i = 0; i < kode.length;i++){
                 if (cocokkanK(kode[i], inputK)) {
                System.out.println("Kode plat \"" + inputK + "\" adalah kota " + kota[i]);
                ketemu = true;
                break;
            }
        }
        if (!ketemu){
            System.out.println("Kode Plat \" "+inputK+"\" tidak ditemukan");
    
        }
    }
}

