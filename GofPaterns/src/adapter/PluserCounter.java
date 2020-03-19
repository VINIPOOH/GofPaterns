package bridge;


import bridge.adaptee.counter.ComputerFactory;
import bridge.adaptee.counter.Counter;

import java.util.stream.IntStream;
import java.util.stream.Stream;


public class CalculatorToCounterBridge implements Calculator{
    private ComputerFactory computerFactory=new ComputerFactory();
    private Counter counter= computerFactory.factoryMethod();

    @Override
    public int multiply(int a, int b) {

        return IntStream.generate(()->a).limit(b).reduce((d, c)->counter.sum(d,c)).getAsInt();
    }
}
