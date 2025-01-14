public class Natureza {
    public Natureza() {
        //
    }
    public static void main(String[] args) {
        Doguinho rex = new Doguinho();
        rex.movimentar();
        rex.comer();
        rex.latir();
    }
}

//Superclasse
class Animal {
    void movimentar() {
        System.out.println("Animal movimentando...");
    }
    void comer() {
        System.out.println("Animal comendo...");
    }
}

//Subclasse
class Doguinho extends Animal {
    void movimentar() {
        System.out.println("Doguinho correndo...");
    }
    void latir() {
        System.out.println("Au, au!");
    }
}
