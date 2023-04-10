package Date07_04.doiTuongHinhHoc;

public class Circle extends Shape{
   private double radius = 1.0;

    public Circle(double radius) {
        this.radius = radius;
    }


    public Circle() {
    }

    public Circle(String color, boolean filled) {
        super(color, filled);
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return Math.PI*2*this.radius;
    }
    public double getPerimeter(){
        return Math.PI*this.radius*this.radius;
    }


    @Override
    public String toString() {
        return "A Circle with{" +
                "radius=" + getRadius() +
                "which is a subclass of yyy"+super.toString()+ '}';
    }
}
