package classes_and_objects.lab9.runner;

import classes_and_objects.lab9.classes.Ball;
import classes_and_objects.lab9.classes.Basket;

import java.util.LinkedList;

public class Execute {

    public static double getBallsWeight(Basket basket) {
        double weight = 0;

        for (Ball ball : basket.getBallsList()) {
            weight += ball.getWeight();
        }
        return weight;
    }

    private static LinkedList<Ball> getBallsListByColour(Basket basket, String colour) {
        LinkedList<Ball> ballsList = new LinkedList<>();

        for (Ball ball : basket.getBallsList()) {

            if (ball.getColour().toLowerCase().equals(colour.toLowerCase())) {
                ballsList.add(ball);
            }
        }
        return ballsList;
    }

    public static int getCountOfColoredBalls(Basket basket, String colour) throws IllegalArgumentException  {

        return getBallsListByColour(basket, colour).size();
    }
}