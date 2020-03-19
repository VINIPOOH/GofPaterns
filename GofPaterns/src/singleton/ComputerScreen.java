package singleton;

class ComputerScreen implements Screen {
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
        return "shoved on computer screen answer "+a;
    }
}
