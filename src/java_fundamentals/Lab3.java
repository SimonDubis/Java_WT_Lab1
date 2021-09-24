package java_fundamentals;

import java.util.Scanner;

public class Lab3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a, b, h: ");
        int a = in.nextInt();
        int b = in.nextInt();
        int h = in.nextInt();

        for (int i = a; i <= b; i += h){
            int x = i;
            double f = Math.tan(x);
            System.out.println("x = " + x + "; F(x) = " + f);
        }
    }
}
