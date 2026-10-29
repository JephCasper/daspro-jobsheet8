import java.util.Scanner;

public class Tugas3no29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int jumlahToko;

        do {
            System.out.print("Masukkan jumlah toko (minimal 1): ");
            jumlahToko = sc.nextInt();
            
            if (jumlahToko < 1) {
                System.out.println(" Jumlah toko minimal harus 1. Silakan ulangi!");
            }
        } while (jumlahToko < 1);
        
        System.out.println();
        
        int totalBarangSeluruhToko = 0;
        int maxBarang = -1;
        int tokoTerbanyak = 0;
        
        for (int i = 1; i <= jumlahToko; i++) {
            System.out.println("Toko " + i);
            
            int jumlahPelanggan;

            do {
                System.out.print("  Masukkan jumlah pelanggan: ");
                jumlahPelanggan = sc.nextInt();
                
                if (jumlahPelanggan < 0) {
                    System.out.println("  Jumlah pelanggan tidak boleh negatif. Ulangi input!");
                }
            } while (jumlahPelanggan < 0);
            
            int totalBarangToko = 0;
            
            for (int j = 1; j <= jumlahPelanggan; j++) {
                int barang;
                do {
                    System.out.print("  Jumlah barang pelanggan " + j + ": ");
                    barang = sc.nextInt();
                    
                    if (barang < 0) {
                        System.out.println("  Jumlah barang tidak boleh negatif. Ulangi input!");
                    }
                } while (barang < 0);
                
                totalBarangToko += barang;
            }
            System.out.println("  Toko " + i + " -> pelanggan: " + jumlahPelanggan + ", total barang: " + totalBarangToko);
            System.out.println();

            totalBarangSeluruhToko += totalBarangToko;
            
            if (totalBarangToko > maxBarang) {
                maxBarang = totalBarangToko;
                tokoTerbanyak = i;
            }
        }
        System.out.println("======================================");
        System.out.println("Total barang seluruh toko: " + totalBarangSeluruhToko);
        System.out.println("Toko dengan barang terbanyak: " + tokoTerbanyak);
        
        sc.close();
    }
}