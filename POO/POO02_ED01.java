// Faça um programa que peça dois números e imprima o maior deles 
import java.util.Scanner;
public class POO02_ED01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o primeiro número:");
        int numero1 = input.nextInt();
        System.out.println("Digite o segundo número:");
        int numero2 = input.nextInt();

        if (numero1 > numero2) {
            System.out.println("O número " + numero1 + " é maior.");
            
        }
        else {
            System.out.println("O número" + numero2 + " é maior.");
        }

        input.close();
    }
    
}
