package prototype;

public interface CounterPrototype extends Cloneable {
    int sum(int a, int b);

    CounterPrototype clone();
}
