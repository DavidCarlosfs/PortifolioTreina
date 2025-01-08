package EstruturaCondicional;
/*Faça um programa que peça um número ao usuário e imprima na tela se o valor é
positivo ou negativo. */
import java.util.Scanner;
public class Question2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Dgite o número:");
        double number = input.nextDouble();

        input.close();

        if (number > 0) {
            System.out.println("O número informado é positivo!");
        }
        else if (number == 0) {
            System.out.println("O número informado é neutro.");
        }
        else {
            System.out.println("O número informado é negativo!");
        }

    }
    
}
