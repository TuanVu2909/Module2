package Date07_04.poin2DVaPoin3D;

import java.util.Arrays;

public class TestPoint2D {
    public static void main(String[] args) {
        Point2D point2D = new Point2D();
        Point2D[] arr = {point2D};
        point2D.setXY(3.0f,4.0f);
        System.out.println(Arrays.toString(arr));


    }
}
