/*Questão 13: Cálculo da Área de um Retângulo
 * Implemente um programa em Java que receba a largura e a altura de um
 * retângulo e imprima sua área. A formula da área do retângulo é:
 * A = largura x altura.
 */
import java.util.Scanner;
public class Question13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Primeiro informe a largura do retângulo:");
        int largura_retangulo = input.nextInt();
        System.out.println("Agora informe a altura do retângulo:");
        int altura_retangulo = input.nextInt();

        int area_retangulo = largura_retangulo * altura_retangulo;

        System.out.println("A área deste retângulo é: " + area_retangulo);

        input.close();
    }
    
}
