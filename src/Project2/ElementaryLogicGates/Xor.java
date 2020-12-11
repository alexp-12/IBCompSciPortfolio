package Project2.ElementaryLogicGates;

public class Xor {
    public boolean out;
    Not not1 = new Not();
    Not not2 = new Not();
    And and1 = new And();
    And and2 = new And();
    Or or1 = new Or();

    public Xor() {

    }

    public void compute(boolean a, boolean b){
        not1.compute(a);
        not2.compute(b);
        and1.compute(not1.out, b);
        and2.compute(a, not2.out);
        or1.compute(and1.out, and2.out);
        out = or1.out;

    }
}

