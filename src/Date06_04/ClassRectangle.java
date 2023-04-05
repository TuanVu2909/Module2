package Date06_04;

import java.util.Scanner;

public class ClassRectangle {
    double with;
    double height;

    public double getWith() {
        return with;
    }

    public void setWith(double with) {
        this.with = with;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public ClassRectangle(double with, double height) {
        this.with = with;
        this.height = height;
    }
    public double getArena(){
        double arena = with*height;
        return arena;
    }
    public double getPerimeter(){
        double perimeter = (with+height)*2;
        return  perimeter;
    }

    public String display(){

        return "ClassRectangle{" +
                "with=" + with +
                ", height=" + height +
                '}';
    }

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        double with = scanner.nextDouble();
//        double height = scanner.nextDouble();
        ClassRectangle rectangle = new ClassRectangle(10,10);
        System.out.println(rectangle.getArena());
        rectangle.setWith(15);
        rectangle.setHeight(20);
        System.out.println(rectangle.getArena());

    }
}
