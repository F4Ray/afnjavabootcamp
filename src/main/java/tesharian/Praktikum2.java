package tesharian;

import java.util.Scanner;

public class Praktikum2 {
    public static void main(String[] args) {
        double x = 0;
        int y = 0;
        boolean a = true;
        Scanner sc = new Scanner(System.in);
        try {
            while(a) {
                x += sc.nextInt();
                y += 1;
            }
        } catch(Exception e) {
            System.out.println("Rata-rata: "+(x/y));
        }
    }
}
