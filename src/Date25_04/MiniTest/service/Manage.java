package Date25_04.MiniTest.service;

import java.io.IOException;

public interface Manage<E> {
    E create() throws IOException;

    E update() throws IOException;

    E delete() throws IOException;

    E getById();

    void displayAll();
}
