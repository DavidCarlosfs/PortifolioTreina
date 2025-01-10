/*Utilizando o modo imperativo
Faça um programa que receba a soma de todas as verbas recebidas por um
 * funcionário no mês (salário, horas-extras e comissões) em uma variável do
 * tipo real denominada Salário Bruto. Após o recebimento calcule e exiba na
 * tela o valor do INSS e o salário-líquido que é obtido abatendo-se do
 * Salário Bruto da soma dos descontos.
 * Valor imposto de renda: 5% sobre o salário Bruto
 * Valor INSS: 11% sobre o salário Bruto.
 */
import java.util.Scanner;
public class Question2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double inss = 0.11;
        double imposto_renda = 0.05;

        System.out.print("Digite o valor do salário: R$");
        double salario = input.nextDouble();
        System.out.print("Digite o valor das horas-extras: R$");
        double horas_extras = input.nextDouble();
        System.out.print("Digite o valor das comissões: R$");
        double comissoes = input.nextDouble();

        double salario_bruto = salario + horas_extras + comissoes;

        double valor_inss = salario_bruto * inss;

        double salario_liquido = salario_bruto - ((salario_bruto * imposto_renda) + valor_inss);

        System.out.println("Valor do INSS: R$" + valor_inss);
        System.out.println("Valor do salário líquido: R$" + salario_liquido);


    }
    
}
