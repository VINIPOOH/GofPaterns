package proxy;


class Computer implements Counter {
    @Override
    public int sum(int a, int b) {
        System.out.println("contByPc");
        return a + b;
    }
}
