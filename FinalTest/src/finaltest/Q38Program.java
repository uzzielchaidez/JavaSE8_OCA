package finaltest;

class Animal {
    public void eat() throws Exception { System.out.print("Animal eats");}
}

class Q38Program extends Animal {
    public void eat() { System.out.print("Dog eats"); }

    public static void main(String [] args)  {
        Animal a = new Q38Program();
        Q38Program d = new Q38Program();
        d.eat();
        a.eat();                // Se debe especificar throws en la firma o encerrar en bloque try catch.
    }
}
