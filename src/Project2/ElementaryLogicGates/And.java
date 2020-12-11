package Project2.ElementaryLogicGates;

public class And {
    public boolean out;
    public Not not1 = new Not();
    public Nand nand1 = new Nand();
    public And() {
    }

    public void compute(boolean a, boolean b){
        nand1.compute(a,b);
        not1.compute(nand1.out);
        out = not1.out;

    }
}