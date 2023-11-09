import java.util.Scanner;

public class PersegiAngka {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai N (minimal 3): ");
        int N = scanner.nextInt();

        if (N < 3) 
        {
        for (int i = 1; i <= N; i++) // Print baris pertama (Loop1)
            {
                System.out.print(N + " ");
            }
        System.out.println();
        for (int i = 2; i <= N - 1; i++) // Print baris kedua sampe baris ke-(N-1) (Outer Loop)
            {
                System.out.print(N + " "); 
                for (int j = 2; j <= N - 1; j++) // Membuat jarak di tengah kotak (Inner Loop)
                {
                    System.out.print("  ");
                }
                System.out.println(N);
            }
        for (int i = 1; i <= N; i++) // Print baris terakhir (Loop2)
            {
                System.out.print(N + " ");
            }
        System.out.println();
        }
        else // Jika nilai N < 3
        {
            System.out.println("Nilai N harus minimal 3.");
        }
    }
}
