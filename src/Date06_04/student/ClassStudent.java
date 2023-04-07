package Date06_04.student;

public class ClassStudent {
    String ten;
    int tuoi;
    double toan;

    @Override
    public String toString() {
        return "TbMax{" +
                "ten='" + ten + '\'' +
                ", tuoi=" + tuoi +
                ", toan=" + toan +
                ", ly=" + ly +
                ", hoa=" + hoa +
                '}';
    }

    double ly;
    double hoa;

    public ClassStudent() {
    }
    //    public ClassStudent(String ten, int tuoi, double toan, double ly, double hoa) {
//        this.ten = ten;
//        this.tuoi = tuoi;
//        this.toan = toan;
//        this.ly = ly;
//        this.hoa = hoa;
//    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public double getToan() {
        return toan;
    }

    public void setToan(double toan) {
        this.toan = toan;
    }

    public double getLy() {
        return ly;
    }

    public void setLy(double ly) {
        this.ly = ly;
    }

    public double getHoa() {
        return hoa;
    }

    public void setHoa(double hoa) {
        this.hoa = hoa;
    }
}
