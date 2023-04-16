package BaiTapQuan.miniTestDate14_04;

public class Person {
    private static int idUp = 1;
    int id;
    private String name;
    private String age;

    public Person() {
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

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Person(String name, String age) {
        this.id = idUp++;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return  id +
                ". name='" + name + '\'' +
                ". age='" + age + '\'' ;
    }
}
