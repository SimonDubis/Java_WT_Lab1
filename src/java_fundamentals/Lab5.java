package java_fundamentals;

import java.util.Scanner;

public class Lab5 {
    public static void main(String[] args) {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size n = ");
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * 100);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        int currMaxNumber = array[0];
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i + 1] <= currMaxNumber) {
                count++;
            }
            else {
                currMaxNumber = array[i + 1];
            }
        }
        System.out.println("Count of element k = " + count);
    }
}
