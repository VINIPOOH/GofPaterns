package builder;

import java.util.Arrays;

class CPU implements CounterBrain {
    @Override
    public int count(int... a) {
        return Arrays.stream(a).sum();
    }
}
