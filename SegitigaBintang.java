import java.util.Scanner;

public class SegitigaBintang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai N (minimal 5): ");
        int N = scanner.nextInt();

        if (N > 5) 
        {
            for (int i = N; i >= 1; i--) // (Outer Loop)
            {    
            for (int j = 1; j <= i; j++) // Print * sebanyak jumlah inputan i(Inner Loop)
            {
                System.out.print("*");
            }
            System.out.println(); // Membuat Enter setelah setiap baris selesai dicetak
            }
        }
        else
        {
            System.out.println("Nilai N harus minimal 5.");
        }
        }
    }

