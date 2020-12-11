package Project2.ElementaryLogicGates;

public class Dmux {

    public boolean a;
    public boolean b;
    public Not not1 = new Not();
    public And and1 = new And();
    public And and2 = new And();
    public Dmux() {

    }

    public void compute(boolean in, boolean sel){
        not1.compute(sel);
        and1.compute(in,sel);
        and2.compute(in,not1.out);

        b = and1.out;
        a = and2.out;


    }
}