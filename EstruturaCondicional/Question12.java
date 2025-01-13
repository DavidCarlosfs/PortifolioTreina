/*Faça um programa para o cálculo de uma folha de pagamento, sabendo que os
descontos são do Imposto de Renda, que depende do salário bruto (conforme
tabela abaixo) e 3% para o Sindicato e que o FGTS corresponde a 11% do Salário
Bruto, mas não é descontado (é a empresa que deposita). O Salário Líquido
corresponde ao Salário Bruto menos os descontos. O programa deverá pedir ao
usuário o valor da sua hora e a quantidade de horas trabalhadas no mês.
Desconto do IR:
● Salário Bruto até R$ 900 (inclusive): isento;
● Salário Bruto até R$ 1500 (inclusive): desconto de 5%;
● Salário Bruto até R$ 2500 (inclusive): desconto de 10%;
● Salário Bruto acima de 2500 - desconto de 20%
Imprima na tela as informações, dispostas conforme o exemplo a seguir. No
exemplo o valor da hora é R$ 5 e a quantidade de horas trabalhadas é 220.
Salário Bruto: R$ 5 * 220 = R$ 1100,00
(-) IR (5%) : R$ 55,00
(-) INSS (10%) : R$ 110,00
(-) FGTS (11%): R$ 121,00
Total de descontos: R$ 165,00
Salário Líquido: R$ 935,00 */
import java.util.Scanner;
public class Question12 {
    public static void main(String[] args) {
    double salario_liquido = 0;
    double imposto_renda = 0;
    double inss = 0.10;
    double fgts = 0.11;
    double valor_ir = 0;
    double valor_inss = 0;
    double valor_fgts = 0;

    Scanner input = new Scanner(System.in);
    System.out.print("Digite o valor da sua hora: R$");
    double valor_hora = input.nextDouble();
    System.out.println("Quantas horas você trabalhou neste mês?");
    int horas_trabalhadas = input.nextInt();
    input.close();

    double salario_bruto = valor_hora * horas_trabalhadas;
    valor_fgts = salario_bruto * fgts;
    valor_inss = salario_bruto * inss;   
    
    if (salario_bruto <= 900) {
        salario_liquido = salario_bruto;
    } else if (salario_bruto <= 1500) {
        imposto_renda = 0.05;
        salario_liquido = salario_bruto - (salario_bruto * imposto_renda);
        valor_ir = salario_bruto * imposto_renda;
    } else if (salario_bruto <= 2500) {
        imposto_renda = 0.10;
        salario_liquido = salario_bruto - (salario_bruto * imposto_renda);
        valor_ir = salario_bruto * imposto_renda;
    } else {
        imposto_renda = 0.20;
        salario_liquido = salario_bruto - (salario_bruto * imposto_renda);
        valor_ir = salario_bruto * imposto_renda;
    }

    salario_liquido = salario_liquido - (salario_bruto * inss);


    System.out.println("Salário bruto: R$" + salario_bruto);
    System.out.println("IR: R$" + valor_ir);
    System.out.println("INSS: R$" + valor_inss);
    System.out.println("FGTS: R$" + valor_fgts);
    System.out.println("Total de descontos: R$" + (valor_inss + valor_ir));
    System.out.println("Salário líquido: R$" + salario_liquido);

    }

    
    
}
