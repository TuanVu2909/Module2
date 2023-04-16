package BaiTapQuan.Date12_04.QuanLySanPham;

public class Brand {
    private static int idUp =1;
    int id;
    String name;

    public Brand() {
        this.id = idUp++;
    }

    public Brand( String name) {
        this.id = idUp++;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return id + ". name='" + name ;
    }
}
