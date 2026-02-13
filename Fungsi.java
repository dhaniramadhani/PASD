public class Fungsi {
    public static int hitungP(int[] stok, int[] harga) {
        int total = 0;
        for (int i = 0; i < stok.length; i++) {
            total += stok[i] * harga[i];
        }
        return total;
    }
    public static String statusCabang(int pendapatan) {
        if (pendapatan > 1500000)
            return "Sangat Baik";
        else
            return "Perlu Evaluasi";
    }
    
    public static void main(String[] args) {
        int[][] stok = { 
            {10,5,15,7},
            {6,11,9,12},
            {2,10,10,5},
            {5,7,12,9}
        };
        String[] cabang ={
            "Royal Garden 1",
            "Royal Garden 2",
            "Royal Garden 3",
            "Royal Garden 4"
        };
        int [] harga = {75000,50000,60000,10000};

        System.out.println("=== DATA PENDAPATAN ROYAL GARDEN ===\n");

        for(int i = 0; i < stok.length; i++){

            int pendapatan = hitungP(stok[i], harga);
            String status = statusCabang(pendapatan);

            System.out.println(cabang[i]);
            System.out.println("Pendapatan : Rp."+pendapatan);
            System.out.println("Status : "+ status);
            System.out.println();
        }
    }
}


