package diagnostictest;

class Q51Program {
    public static void main(String args [ ]) {
        AA ab = new BB();
        
        //insert here
        System.out.print(ab.x);     //Funciona porque la variable x viene de instancia y es accesible protected
        System.out.print(BB.j);     //Funciona porque la variable j viene de static y es accesible default
        System.out.print(ab.j);     //Funciona porque la variable j viene de instancia y es accesible default
        System.out.print(AA.x);     //No funciona porque la variable x no es static y se quiere acceder
        System.out.print(AA.j);     //Funciona porque la variable j viene de static y es accesible default
    }
}
class AA {
    protected int x = 10;
    static int j = 21;
}
class BB extends AA {
}
