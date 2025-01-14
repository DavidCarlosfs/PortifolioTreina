public class Heranca01 {
    public Heranca01 () {
        // Construtor
    }

public static void main (String[] args) {
    //
    }
}

//Superclasse
class Veiculo {
    public void acelerar(double intensidade) {
        System.out.println("Veículo acelerando...");
    }
}

// Subclasse
class Carro extends Veiculo {
    public void acelerar() {
        System.out.println("Acelerando o carro.");
    }
}

// Subclasse
class Moto extends Veiculo {
    public void acelerar () {
        System.out.println("Dei o grau!!!");
    }
}