package prototype;

class PhoneScreen implements Screen {
    @Override
    public Screen clone() {
        try {
            return (Screen) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    @Override
    public String show(int a) {
        return "shoved on phone screen answer "+a;
    }
}
