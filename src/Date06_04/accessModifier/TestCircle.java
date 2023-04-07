package Date06_04.accessModifier;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.getRadius();
        circle.setRadius(10);
        circle.getColor();
        circle.setColor("yellow");
        System.out.println(circle);

    }
    public void getRadius(){
        this.getRadius();
    }
    public  void getArea(){
        
    }

}
