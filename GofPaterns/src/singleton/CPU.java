package singleton;

import java.util.Arrays;

class CPU implements CounterBrain {
    @Override
    public CounterBrain clone() {
        try {
            return (CounterBrain) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    @Override
    public int count(int... a) {
        return Arrays.stream(a).sum();
    }
}
