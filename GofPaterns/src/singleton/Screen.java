package singleton;

public interface Screen  extends Cloneable{
    Screen clone();
    String show(int a);
}
