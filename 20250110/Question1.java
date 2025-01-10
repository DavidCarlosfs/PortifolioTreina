/*Desenvolva apenas utilizando o modo imperativo
 * O custo ao consumidor de um carro novo é a soma do custo de fábrica com a
 * percentagem do distribuidor e dos impostos (aplicados, primeiro os impostos
 * sobre o custo de fábrica, e depois a percentagem do distribuidor sobe o
 * resultado). Supondo que a percentagem do distribuidor seja de 28% e os
 * impostos 45%. Escrever um programa que leia o custo de fábrica de um carro
 * e informe o custo ao consumidor do mesmo.
 */
import java.util.Scanner;
public class Question1 {
    public static void main(String[] args) {
        double percentagem_distribuidor = 0.28;
        double imposto = 0.45;

        Scanner input = new Scanner(System.in);
        System.out.print("Informe o valor do custo de fábrica do carro: R$");
        double carro_fabrica = input.nextDouble();
        input.close();

        double custo_ditribuidor = carro_fabrica * percentagem_distribuidor;
        double custo_imposto = carro_fabrica * imposto;
        double carro_novo = carro_fabrica + custo_ditribuidor + custo_imposto;

        System.out.print("O valor final do carro novo fica R$" + carro_novo);
    }
}
