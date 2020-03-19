package abstractfactory;

class PhoneScreen implements Screen {
    @Override
    public String show(int a) {
        return "shoved on phone screen answer "+a;
    }
}
