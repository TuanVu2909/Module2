package Date14_04;

import java.util.ArrayList;

public class MyList<E> {
    int size = 0;
    static final int DEFAULT_CAPACITY=10;
    ArrayList<E> lstObject;

    public MyList() {
    }
    public MyList(int capacity) {
        this.lstObject = new ArrayList<E>(capacity);
        this.size =capacity;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public ArrayList<E> getLstObject() {
        return lstObject;
    }

    public void setLstObject(ArrayList<E> lstObject) {
        this.lstObject = lstObject;
    }
}
