/*Questão 16: Conversor de Unidade (peso)
 * Implemente um programa em Java que receba um valor em quilogramas e
 * retorne o valor equivalente em libras. Considere que 1 kg é equivalente
 * a 2,20462 libras.
 */
import java.util.Scanner;
public class Question16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o valor em kg:");
        double peso_kg = input.nextInt();
        double libra_kg = 2.20462;

        System.out.println("O peso informado em libras fica " + peso_kg * libra_kg + "lb.");

    }
    
}
