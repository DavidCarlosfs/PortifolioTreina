/*Faça um programa que peça uma nota, entre zero e dez. Mostre uma mensagem
caso o valor seja inválido e continue pedindo até que o usuário informe um valor
válido. */
import java.util.Scanner;
public class Question01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double nota;

        do {
            System.out.println("Digite uma nota de 0 a 10:");
            nota = input.nextDouble();

            if (nota < 0 || nota > 10) {
                System.out.println("Nota inválida! Por favor insira uma notre entre 0 a 10:");
            }
        } while (nota < 0 || nota > 10);
        System.out.println("Nota válida: " + nota);
        input.close();
    }
    
}