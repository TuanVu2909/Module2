package Date07_04.circlevaCylinder;

public class TestCylinder {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(3.0,"red",4.0);
        double v =   volumeCylinder(cylinder);
        System.out.println(v);
        System.out.println(cylinder);
    }
    public static double volumeCylinder(Cylinder V){
        return V.height* V.radius* V.radius*Math.PI;
    }
}
