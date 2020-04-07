package singleton;

class PhoneCortexACLU implements CounterBrain {
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
        return a[0] + a[1];
    }
}
