package bridge.adaptee.counter;

public class ComputerFactory implements CounterCreator {
    @Override
    public Counter factoryMethod() {
        return new Computer();
    }
}
