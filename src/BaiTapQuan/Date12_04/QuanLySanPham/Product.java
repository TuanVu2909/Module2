package BaiTapQuan.Date12_04.QuanLySanPham;

public class Product {
    private static int idUp = 1;
    int id;
    String name;
    double price;
    String description;
    Brand brand;

    public Product( String name, double price, String description, Brand brand) {
        this.id = idUp++;
        this.name = name;
        this.price = price;
        this.description = description;
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return   id + ", name='" + name + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", brand=" + brand.getName();
    }
}
