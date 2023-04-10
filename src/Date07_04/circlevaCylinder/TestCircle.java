package Date07_04.circlevaCylinder;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle(3.0,"red");
        double s = circle.acreageCircle(circle.getRadius());
        System.out.println(s);
        System.out.println(circle);

    }
}
