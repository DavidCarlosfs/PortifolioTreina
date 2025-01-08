package EstruturaCondicional;
/*Questão 1: Maior de Dois Números
 * Faça um programa que peça dois números do usuário e imprima o maior deles.
 */
import java.util.Scanner;
public class Question1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Insira o primeiro número:");
        double numero1 = input.nextDouble();
        System.out.println("Agora insira o segundo número:");
        double numero2 = input.nextDouble();

        if (numero1 > numero2) {
            System.out.println("O maior número é " + numero1);
        }
        else if (numero1 == numero2) {
            System.out.println("Os números são iguais.");
        }
        else {
            System.out.println("O maior número é " + numero2);
        }

        input.close();
    }
    
}
