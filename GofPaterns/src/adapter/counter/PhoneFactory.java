package adapter.counter;

class PhoneFactory implements CounterCreator {
    @Override
    public Counter factoryMethod() {
        return new Phone();
    }
}
