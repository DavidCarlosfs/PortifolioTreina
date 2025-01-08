/*Questão 15: Cálculo do Volume de um Cone
 * Implemente um programa em Java que receba o raio da base e a altura
 * de um cone e retorne seu volume. A fórmula do volume do cone é:
 * V = 1 / 3 x pi x r² x h.
 */
import java.util.Scanner;
public class Question15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Primeiro digite o raio da base do cone:");
        int raio_cone = input.nextInt();
        System.out.println("Agora digite a altura do cone:");
        int altura_cone = input.nextInt();

        double volume_cone = (3.14 * (raio_cone * raio_cone) * altura_cone) / 3;

        System.out.println("O volume deste cone é " + volume_cone);

        input.close();


}
}
