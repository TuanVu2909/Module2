package Date25_04.Person;

import java.io.Serializable;


public class Person implements Serializable {
    private static final long serialVersionUID = 1L;
    // serialVersionUID thể hiện phiên bản của đối tượng được lưu vào trong file.
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return id + ", " + name;
    }
}
