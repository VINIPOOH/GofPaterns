package abstractfactory;

public class ComputerFactory implements CounterAbstractFactory {
    @Override
    public Counter factoryMethod() {
        return new Computer(new CPU(), new ComputerScreen());
    }
}
