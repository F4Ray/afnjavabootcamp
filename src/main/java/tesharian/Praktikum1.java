package tesharian;

import java.util.Scanner;

public class Praktikum1
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan kata:");
        String input = scanner.nextLine();

        scanner.close();

        int hasilnya = 0;
        for (int i = 0; i < input.length(); i++)
        {
            char ch = input.charAt(i);
            if (ch < 97)
            {
                hasilnya += ch;
            }
        }
        System.out.println("Hasil:" + hasilnya);
    }

}
