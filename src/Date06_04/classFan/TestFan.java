package Date06_04.classFan;

import java.util.Scanner;

public class TestFan {
    public static void main(String[] args) {
        final int slow = 1;
        final int medium = 2;
        final int fast = 3;

//        int speed = slow;
//        boolean on = false;
//        double radius = 5;
//        String color = "blue";
//
//        ClassFan fan = new ClassFan(speed,on,radius,color);

//        if (on){
//            System.out.println(getRadius(fan));
//            fan.setSpeed(medium);
//            System.out.println(getColor(fan));
//            System.out.println(getSpeed(fan));
//            System.out.println("fan is off");
//        }else {
//            System.out.println(getSpeed(fan));
//            fan.setSpeed(fast);
//            System.out.println(getRadius(fan));
//            fan.setRadius(10);
//            System.out.println(getColor(fan));
//            fan.setColor("yellow");
//            System.out.println("fan is on");
//        }


        ClassFan fan1 = new ClassFan(fast, true,10,"yellow");
        ClassFan fan2 = new ClassFan(medium, false,5,"bule");
//        System.out.println(fan1);
//        System.out.println(fan2);
        System.out.println(onOff(fan1));
        System.out.println(onOff(fan2));

    }
    public static String onOff(ClassFan fan){
        if(fan.isOn()){
            return "Fan{" +
                    "speed=" + fan.getSpeed() +
                    ", radius=" + fan.getRadius() +
                    ", color='" + fan.getColor() + '\'' +
                    ", fan is on" +
                    '}';
        }else {
            return "Fan{" +
                    "radius=" + fan.getRadius() +
                    ", color='" + fan.getColor() + '\'' +
                    ", fan is off" +
                    '}';
        }
    }

//    public static int getSpeed(ClassFan fan){
//            return fan.getSpeed();
//    }
//    public static double getRadius(ClassFan fan){
//        return fan.getRadius();
//    }
//    public static String getColor(ClassFan fan){
//        return fan.getColor();
//    }

}
