package abstractfactory;


class Phone implements Counter {
    private PhoneCortexACLU phoneCortexACLU;
    private PhoneScreen phoneScreen;

    public Phone(PhoneCortexACLU phoneCortexACLU, PhoneScreen phoneScreen) {
        this.phoneCortexACLU = phoneCortexACLU;
        this.phoneScreen = phoneScreen;
    }

    @Override
    public int sum(int a, int b) {
        phoneScreen.show(phoneCortexACLU.count(a,b));
        return a+b;
    }
}
