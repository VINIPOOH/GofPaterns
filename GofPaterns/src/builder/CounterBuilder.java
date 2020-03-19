package builder;

public interface CounterBuilder {
    void counterBrain(CounterBrain counterBrain);
    void screen(Screen screen);
    Counter build();
}
