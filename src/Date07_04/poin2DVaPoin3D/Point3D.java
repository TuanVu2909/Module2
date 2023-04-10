package Date07_04.poin2DVaPoin3D;

public class Point3D extends  Point2D{
    private float z = 0.0f;

    public Point3D() {
    }

    public Point3D(float z) {
        this.z = z;
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public  void setXYZ(float x,float y, float z){
        this.z = z;
        this.setX(x);
        this.setY(y);

    }

    @Override
    public String toString() {
        return "Point3D{" +
                "x=" + getX() + ", y=" + getY() + ", z=" +getZ() +
                '}';
    }
}
