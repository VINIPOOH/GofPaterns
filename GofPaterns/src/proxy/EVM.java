package proxy;

public class EVM implements Counter {
    private Computer computer;

    public EVM(Computer computer) {
        this.computer = computer;
    }

    @Override
    public int sum(int a, int b) {
        return computer.sum(a, b);
    }
}
