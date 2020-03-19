package abstractfactory;

class Computer implements Counter {
    private CPU cpu;
    private ComputerScreen computerScreen;

    public Computer(CPU cpu, ComputerScreen computerScreen) {
        this.cpu = cpu;
        this.computerScreen = computerScreen;
    }

    @Override
    public int sum(int a, int b) {
        computerScreen.show(cpu.count(a,b));
        return a+b;
    }
}
