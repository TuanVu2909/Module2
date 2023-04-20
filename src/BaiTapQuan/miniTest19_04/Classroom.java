package BaiTapQuan.miniTest19_04;

public class Classroom {
    private  static  int ipClass =0;
    int id;
    String name;

    public Classroom() {
    }

    public Classroom(String name) {
        this.id = ++ipClass;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Classroom{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
