/*Questão 14: Cálculo do volume de um Cubo
Implemente um programa em Java que receba o comprimento da aresta de um
cubo e retorne seu volume. A fórmula do volume do cubo é: V = aresta³.
 */
import java.util.Scanner;
public class Question14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe o comprimento da aresta do cubo:");
        int aresta_cubo = input.nextInt();

        int volume_cubo = aresta_cubo * aresta_cubo * aresta_cubo;

        System.out.println("O volume do cubo é: " + volume_cubo);

        input.close();
    }
    
}
