package singleton;

public class SingletonsHolder {
    private static Counter pc = new StrangeCountDevise(new CPU(), new ComputerScreen());
    private static Counter phone = new StrangeCountDevise(new PhoneCortexACLU(), new PhoneScreen());

    private SingletonsHolder() {
    }

    public static Counter getPc() {
        return pc;
    }

    public static Counter getPhone() {
        return phone;
    }
}
