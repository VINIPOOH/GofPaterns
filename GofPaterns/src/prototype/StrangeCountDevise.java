package prototype;


class StrangeCountDevise implements CounterPrototype {
    private CounterBrain counterBrain;
    private Screen screen;

    public StrangeCountDevise(CounterBrain counterBrain, Screen screen) {
        this.counterBrain = counterBrain;
        this.screen = screen;
    }

    @Override
    public int sum(int a, int b) {
        screen.show(counterBrain.count(a,b));
        return a+b;
    }

    @Override
    public CounterPrototype clone() {
        return new StrangeCountDevise(counterBrain.clone(),screen.clone());
    }
}
