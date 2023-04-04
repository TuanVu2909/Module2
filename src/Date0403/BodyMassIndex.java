package Date0403;

import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Weight: ");
        double weight = scanner.nextDouble();
        System.out.println("Height: ");
        double height = scanner.nextDouble();
        double bmi = weight/(height*height);
        if (bmi < 18.5){
            System.out.println("UnderWeight");
        }else if (bmi< 25.0){
            System.out.println("Normal");
        }else if(bmi < 30.0){
            System.out.println("Overweight");
        }else {
            System.out.println("Obese");
        }
    }
}
