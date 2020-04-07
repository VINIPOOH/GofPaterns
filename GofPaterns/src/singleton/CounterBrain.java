package singleton;

public interface CounterBrain extends Cloneable {
    CounterBrain clone();

    int count(int... a);
}
