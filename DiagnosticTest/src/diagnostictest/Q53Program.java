package diagnostictest;

class Capacitor {
    int [] array = {1,2,3};
}
class Pc {
    Capacitor cap;
}
public class Q53Program {
    public static void main(String [] args){
        Capacitor c = new Capacitor();
        Pc p = new Pc();
        Pc p1 = p;
        p1 = null;
        p = null;
        //line 14           //Solo 1 objecto y una referencia quedan sin uso, el GC es elegible por 1 objeto
    }
}

