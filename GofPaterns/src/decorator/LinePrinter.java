package decorator;

public class LinePrinter implements Printer {
    @Override
    public void print() {
        System.out.println("---------------------");
    }


}
