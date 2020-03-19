package abstractfactory;

class PhoneFactory implements CounterAbstractFactory {
    @Override
    public Counter factoryMethod() {
        return new Phone(new PhoneCortexACLU(),new PhoneScreen());
    }
}
