package singleton;

public interface Counter extends Cloneable {
    int sum(int a, int b);

    Counter clone();
}
