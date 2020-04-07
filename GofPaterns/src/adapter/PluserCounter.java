package adapter;


import adapter.counter.ComputerFactory;
import adapter.counter.Counter;


public class PluserCounter implements Pluser {
    private ComputerFactory computerFactory = new ComputerFactory();
    private Counter counter = computerFactory.factoryMethod();

    @Override
    public int plus(int a, int b) {
        return counter.sum(a, b);
    }
}
