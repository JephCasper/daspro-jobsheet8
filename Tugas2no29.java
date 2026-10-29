import java.util.Scanner;
public class Tugas2no29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
         do {
            System.out.print("Masukkan nilai n (minimal 3) = ");
            n = sc.nextInt();
            
            if (n < 3) {
                System.out.println(" Nilai n tidak valid! Nilai n harus minimal 3. Silakan ulangi.");
            }
        } while (n < 3);
        
        System.out.println(); 
        int jumlahSeluruh = 0; 
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                int hasil = i * j;
                System.out.printf("%4d", hasil); 
                jumlahSeluruh += hasil;
            }
            System.out.println();
        }
        System.out.println("Jumlah seluruh angka: " + jumlahSeluruh);
        sc.close();
    }
}