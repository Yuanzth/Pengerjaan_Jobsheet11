import java.util.Scanner;

public class PorseniData {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[][] dataAtlet = new String[4][5]; // Inisialisasi & Instansiasi array untuk menyimpan data atlet

        System.out.println("Input data atlet Badminton:"); // Menginput data atlet untuk setiap cabor
        for (int i = 0; i < 5; i++) 
        {
            System.out.print("Masukkan nama atlet ke-" + (i + 1) + ": ");
            dataAtlet[0][i] = input.nextLine();
        }

        System.out.println("Input data atlet Tenis Meja:");
        for (int i = 0; i < 5; i++) 
        {
            System.out.print("Masukkan nama atlet ke-" + (i + 1) + ": ");
            dataAtlet[1][i] = input.nextLine();
        }

        System.out.println("Input data atlet Basket:");
        for (int i = 0; i < 5; i++) 
        {
            System.out.print("Masukkan nama atlet ke-" + (i + 1) + ": ");
            dataAtlet[2][i] = input.nextLine();
        }

        System.out.println("Input data atlet Bola Voly:");
        for (int i = 0; i < 5; i++) 
        {
            System.out.print("Masukkan nama atlet ke-" + (i + 1) + ": ");
            dataAtlet[3][i] = input.nextLine();
        }

        // ============================Sorting data atlet============================ //
        for (int i = 0; i < dataAtlet.length; i++) 
        {
            for (int j = 0; j < dataAtlet[i].length - 1; j++) 
            {
                for (int k = j + 1; k < dataAtlet[i].length; k++) 
                {
                    if (dataAtlet[i][j].compareTo(dataAtlet[i][k]) > 0) // Swap data jika ditemukan atlet yang lebih kecil
                    {
                        String temp = dataAtlet[i][j];
                        dataAtlet[i][j] = dataAtlet[i][k];
                        dataAtlet[i][k] = temp;
                    }
                }
            }
        }

        // Menampilkan data atlet yang sudah diurutkan berdasarkan Abjad
        System.out.println("\nData Atlet yang Diurutkan:");
        for (int i = 0; i < dataAtlet.length; i++) 
        {
            System.out.println("\nCabang Olahraga: " + (i == 0 ? "Badminton" : (i == 1 ? "Tenis Meja" : (i == 2 ? "Basket" : "Bola Voly"))));
            for (int j = 0; j < dataAtlet[i].length; j++) 
            {
                System.out.println(" - " + dataAtlet[i][j]);
            }
        }
    }
}
