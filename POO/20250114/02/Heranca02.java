public class Heranca02 {
    public Heranca02 () {
        // Construtor
    }

public static void main (String[] args) {
    Veiculo carro = new Carro();
    carro.acelerar(15.8);

    Carro novoCarro = new Carro();
    novoCarro.acelerar();

    Moto novaMoto = new Moto();
    novaMoto.acelerar();
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