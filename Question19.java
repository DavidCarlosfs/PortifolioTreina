/*Questão 19: Multa sobre o Excesso
 * João Papo-de-Pescador, homem de bem, comprou um microcomputador para
 * controlar o redimento diário de seu trabalho. Toda vez que ele traz
 * um peso de peixes maior que o estabelecido pelo regulamento de pesca
 * do estado de SP (50kg) deve pagar uma multa de R$4,00 por kg excedente.
 * João precisa que você faça um programa que leia a variável peso (de peixe)
 * e calcule o excesso.
 * Gravar na variável excesso a quantidade de quilos além do limite e na
 * variável multa o valor da multa que João deverá pagar. Imprima os
 * dados do programa com as mensagens adequadas.
 */
import java.util.Scanner;
public class Question19 {
    public static void main(String[] args) {
        double regulamentoSP = 50;
        double multa = 4;

        Scanner input = new Scanner(System.in);
        System.out.println("Informe o peso do peixe em kg:");
        double peso_peixe = input.nextDouble();
        input.close();

        /*Resolução usando estrutura de decisão
        if (peso_peixe > 50) {
            double peso_excedente = peso_peixe - regulamentoSP;
            double valor_multa = peso_excedente * multa;
            System.out.println("A quantidade de kg excente foi de " + peso_excedente + "kg.");
            System.out.println("O valor da multa do peso excente foi de R$" + valor_multa);
        }
        else {
            System.out.println("O peixe não ultrapassou o limite estabelecido no regulamento de pesca.");
        }
        */
        double peso_excedente = peso_peixe - regulamentoSP;
        double valor_multa = peso_excedente * multa;
        System.out.println("O peixe pesa " + peso_peixe);
        System.out.println("O peixe excedeu " + peso_excedente + "kg");
        System.out.println("A multa ficou R$" + valor_multa);

    }
    
    

    
}
