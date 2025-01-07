/*Questão 9: Conversão de Unidades (Temperatura)
 * Faça um programa que peça a temperatura em graus Farenheit, transforme
 * e mostre a temperatura em graus Celcius. C = 5 * ((F-32)/9).
 * A fórmula de conversão é: F = 9 / 5 x C + 32.
 */
import java.util.Scanner;
public class Question9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe a temperatura em F");
        double temperatura_F = input.nextDouble();

        double conversao = 5 * ((temperatura_F - 32) / 9);

        System.out.println("A temperatura em Celcius fica: " + conversao + "º");
    }
    
}
