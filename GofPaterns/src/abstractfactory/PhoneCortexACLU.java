package abstractfactory;

class PhoneCortexACLU implements CounterBrain {
    @Override
    public int count(int... a) {
        return a[0] + a[1];
    }
}
