package diagnostictest;

class Animal {
    void run() {
        System.out.print("Animal run");
    }
}

class Dog extends Animal {

    void sound() {
        System.out.print("Bark");
    }

    public void run() {
        System.out.print(" Dog runs");
    }
}

class Q43Program {
    public static void main(String [ ] args){
        Animal dog = new Dog();         // Considerara los metodos 
        //dog.sound();                  // El objeto dog del tipo de dato Animal no contiene el metodo sound
        dog.run();                      // Considerara los metodos sobreescritos no estaticos de la instancia
    }
}
