package classes_and_objects.lab9.runner;

import classes_and_objects.lab9.classes.Ball;
import classes_and_objects.lab9.classes.Basket;

import java.util.Scanner;

public class Main {

    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        Basket basket = new Basket();
        fill(basket);

        try {
            System.out.println("Total ball's weight in basket is: " + Execute.getBallsWeight(basket));
            System.out.println("Count of blue balls is: "+ Execute.getCountOfColoredBalls(basket, "blue"));
        }catch(IllegalArgumentException e) {
            System.out.println( e.getMessage() );
        }

    }

    public static  void fill(Basket basket) {
        int ballsCount;
        double ballWeight;
        String ballColor;

        System.out.print("Enter balls amount: ");
        ballsCount = sc.nextInt();

        for (int i = 0; i < ballsCount; i++) {
            System.out.println("Ball " + (i + 1) + " of " + ballsCount);

            System.out.print("Enter ball's weight: ");
            ballWeight = sc.nextDouble();

            System.out.print("Enter ball's color: ");
            do {
                ballColor = sc.nextLine();
            } while (ballColor.isEmpty());

            basket.addBall(new Ball(ballColor, ballWeight));
        }
    }
}