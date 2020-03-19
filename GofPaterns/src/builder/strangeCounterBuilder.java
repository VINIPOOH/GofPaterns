package builder;

public class strangeCounterBuilder implements CounterBuilder {

    private CounterBrain brain;
    private Screen screen;
    @Override
    public void counterBrain(CounterBrain counterBrain) {
        brain=counterBrain;

    }

    @Override
    public void screen(Screen screen) {
        this.screen=screen;
    }

    @Override
    public Counter build() {
        return new StrangeCountDevise(brain,screen);
    }
}
