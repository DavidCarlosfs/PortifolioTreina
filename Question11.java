/*Questão 11: Cálculo da Área de um Triângulo
 * Implemente um programa em Java que receba a base e a altura de um
 * triângulo e imprima sua área. A fórmula da área do triângulo é:
 * A = base x altura / 2.
 */
import java.util.Scanner;
public class Question11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Primeiro informe a base do triângulo:");
        int base = input.nextInt();
        System.out.println("Agora informe a altura do mesmo triângulo:");
        int altura = input.nextInt();

        int area_triangulo = (base * altura) / 2;

        System.out.println("A área deste triângulo é: " + area_triangulo);

        input.close();
    }
    
}
