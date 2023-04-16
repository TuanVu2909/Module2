package BaiTapNgu.Date12_04;

public class Person {
    private static int idUp =1;
    private int id;
    private String name;
    private int age;
    Address address;

    public Person() {
        this.id = idUp++;
    }

    public Person( String name, int age, Address address) {
        this.id = idUp++;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public static int getIdUp() {
        return idUp;
    }

    public static void setIdUp(int idUp) {
        Person.idUp = idUp;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return id + ". name='" + name + '\'' +
                ". age=" + age +
                ". address=" + address.getName() ;
    }
}
