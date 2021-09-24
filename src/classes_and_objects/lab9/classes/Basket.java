package classes_and_objects.lab9.classes;

import java.util.LinkedList;

public class Basket {

    private LinkedList<Ball> ballsList ;

    public Basket() {
        ballsList = new LinkedList<Ball>();
    }

    public LinkedList<Ball> getBallsList () {
        return ballsList;
    }

    public void addBall (Ball ball) {
        ballsList.add(ball);
    }
}