package decorator;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public interface Printer {
    void print();

    default void add(Printer printer) {
        throw new NotImplementedException();
    }

    default void remove(Printer printer) {
        throw new NotImplementedException();
    }

    default Printer getChild(int index) {
        throw new NotImplementedException();
    }
}
