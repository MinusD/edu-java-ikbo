package lab02.task02;

public class TestBall {
    public static void main(String[] args) {
        Ball ball = new Ball(20, 10);
        Ball ball1 = new Ball();
        System.out.print(ball.getX() + " ");
        System.out.println(ball.getY());
        ball.setX(15);
        ball.setY(30);
        System.out.println(ball);
        ball.setXY(1, 2);
        System.out.println(ball.toString());
        ball.move(2,3);
        System.out.println(ball.toString());
    }
}
