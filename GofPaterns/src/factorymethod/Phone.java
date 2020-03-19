package factorymethod;


class Phone implements Counter {
    @Override
    public int sum(int a, int b) {
        System.out.println("contByPhone");
        return a+b;
    }
}
