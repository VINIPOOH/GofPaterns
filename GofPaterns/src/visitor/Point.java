package visitor;

abstract class Point {
    private double metric = -1;

    public abstract void accept(Visitor v);

    public double getMetric() {
        return metric;
    }

    public void setMetric(double metric) {
        this.metric = metric;
    }
}
