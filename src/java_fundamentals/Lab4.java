package java_fundamentals;

import java.util.Scanner;

public class Lab4 {

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.print("Enter n = ");
        int n = str.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter number + a[" + i + "] = ");
            a[i] = str.nextInt();
        }
        str.close();

        for (int i = 0; i < n; i++) {
            int temp = 0;
            for (int j = 2; j <= Math.sqrt(a[i]); j++) {
                if (a[i] % j == 0) {
                    temp = 1;
                }
            }
            if (temp == 0) {
                System.out.println(a[i] + " - prime number");
            }
        }
    }
}