/*Faça um programa que leia 20 números inteiros e apresente:
a. Média dos ímpares
b. Maior número par
c. Diferença do maior menos o menor número */
import java.util.Scanner;
public class Atividade1 {

    public static void main(String[] args) {
        double media_impar = 0;
        int soma_impar = 0;
        int maior_par = 0;
        int maior_numero = 0;
        int menor_numero = 0;
        int cont_impar = 0;

        Scanner input = new Scanner(System.in);
        
        for (int contador = 0; contador < 20; contador++) {
            System.out.println("Digite o " + (contador + 1) + "º número:");
            int numero = input.nextInt();
            if (numero >= maior_numero) {
                maior_numero = numero;
            } 
            if (menor_numero == 0) {
                menor_numero = maior_numero;
            } else if (numero < menor_numero) {
                menor_numero = numero;
            }
            if (numero % 2 != 0) {
                cont_impar += 1;
                soma_impar += numero;
            } else if (numero >= maior_par) {
                maior_par = numero;
            }
        }
        input.close();
        media_impar = soma_impar / cont_impar;
        int diferenca = maior_numero - menor_numero;
        
        System.out.println("Média dos ímpares: " + media_impar);
        System.out.println("Maior número par: " + maior_par);
        System.out.println("Diferença entre o maior e do menor número: " + diferenca);

    }

}
