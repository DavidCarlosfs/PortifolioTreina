/*Questão 8: Cálculo de salário
 * Faça um programa que pergunte quanto você ganha por hora e o número 
 * de horas trabalhadas no mês. Calcule e imprima o total do seu salário
 * no referido mês
*/
import java.util.Scanner;
public class Question8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe o valor da sua hora-trabalho:");
        double valor_hora = input.nextDouble();
        System.out.println("Informe quantas horas trabalhou neste mês:");
        int hora_trabalho = input.nextInt();

        double salario = valor_hora * hora_trabalho;

        System.out.println("Neste mês o seu salário é de " + salario);

        input.close();

    }

}