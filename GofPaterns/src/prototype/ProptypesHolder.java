package prototype;

public class ProptypesHolder {
    private static CounterPrototype pc = new StrangeCountDevise(new CPU(),new ComputerScreen());
    private static CounterPrototype phone = new StrangeCountDevise(new PhoneCortexACLU(), new PhoneScreen());

    public static CounterPrototype getPc() {
        return pc;
    }

    public static CounterPrototype getPhone() {
        return phone;
    }
}
