/*Questão 12: Cálculo do Volume de um Cilindro
 * Implemente um programa em Java que receba o raio da base e a altura de 
 * um cilindro e retorne seu volume. A fórmula do volume do cilindro é:
 * V = pi x r² x h.
 */
import java.util.Scanner;
public class Question12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Primeiro informe o raio da base do cilindro:");
        int raio_base = input.nextInt();
        System.out.println("Agora informe a altura do mesmo cilindro:");
        int altura_cilindro = input.nextInt();

        double volume_cilindro = 3.14 * (raio_base * raio_base) * altura_cilindro;

        System.out.println("O volume deste cilindro é: " + volume_cilindro);

        input.close();
    }
    
}
