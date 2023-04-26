package Date25_04.Person;

import java.io.Serializable;

public class People implements Serializable {
    private static final long serialVersionUID = 1L;
    // serialVersionUID thể hiện phiên bản của đối tượng được lưu vào trong file.
    private int id;
    private String name;
    private int phoneNumber;

    public People(int id, String name, int phoneNumber) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
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
        return id + ", " + name + ", " + phoneNumber;
    }
}
