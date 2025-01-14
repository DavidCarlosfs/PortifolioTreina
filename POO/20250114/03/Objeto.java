//Código feito em aula apenas para entender sobre o que é Orientação à objeto
public class Objeto {
    public String modelo;

    public static void main(String[] args) {
        carro("Fusquinha");
        acelerar();
    }

public static void carro(String modelo) {modelo = modelo + "amarelo";}

public  void acelerar() {System.out.println("Acc" + this.modelo);}

public  void freiar() { System.out.println("Freiar " + this.modelo);}
}
