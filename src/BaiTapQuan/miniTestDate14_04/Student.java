package BaiTapQuan.miniTestDate14_04;

public class Student extends Person{
    private double avg;

    public Student() {
    }

    public double getAvg() {
        return avg;
    }

    public void setAvg(double avg) {
        this.avg = avg;
    }

    public Student(double avg) {
        this.avg = avg;
    }

    public Student(String name, String age, double avg) {
        super(name, age);
        this.avg = avg;
    }

    @Override
    public String toString() {
        return super.toString()+ ". avg=" + avg ;
    }
}
