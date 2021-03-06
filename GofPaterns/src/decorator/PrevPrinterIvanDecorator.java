package decorator;

import java.util.LinkedList;

public class PrevPrinterIvanDecorator implements Printer {
    private LinkedList<Printer> printers = new LinkedList<>();

    @Override
    public void print() {
        System.out.println("Ivan Ivan Ivan");
        printers.stream().forEach(Printer::print);
    }

    @Override
    public void add(Printer printer) {
        printers.addLast(printer);
    }

    @Override
    public void remove(Printer printer) {
        printers.remove(printer);
    }

    @Override
    public Printer getChild(int index) {
        return printers.get(index);
    }
}
