/*Questão 10: Cálculo do volume de uma Esfera
 * Implemente um programa em Java que receba o raio de uma esfera e retorne
 * seu volume. A fórmula do volume de uma esfera é dada por:
 * V = 4 / 3 x pi x r³.
 */
import java.util.Scanner;
public class Question10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe o raio da esfera:");
        int raio = input.nextInt();
        double pi = 3.14;

        double volume = 4 / 3 * pi * (raio * raio * raio);

        System.out.println("O volume da esfera é: " + volume);

        input.close();

    }
    
}
