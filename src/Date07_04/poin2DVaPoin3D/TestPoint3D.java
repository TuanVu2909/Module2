package Date07_04.poin2DVaPoin3D;

import java.util.Arrays;

public class TestPoint3D {
    public static void main(String[] args) {
        Point3D point3D = new Point3D();
        Point3D[] arr = {point3D};
        point3D.setXYZ(2.0f, 3.0f, 4.0f);
        System.out.println(Arrays.toString(arr));
    }
}
