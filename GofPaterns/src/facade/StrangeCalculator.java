package facade;

public class StrangeCalculator {
    public int strangeBinaryOperation(int a, int b){
        Summer summer=new Summer();
        Multiply multiply=new Multiply();
        int result=summer.sum(a,b);
        result=multiply.multiply(result,a);
        return result;
    }
}
