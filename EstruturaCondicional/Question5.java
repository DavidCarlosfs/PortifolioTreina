package EstruturaCondicional;
/*Questão 5: Cálculo de média de duas notas
 * Faça um programa para a leitura de duas notas parciais de um aluno. O programa
deve calcular a média alcançada por aluno e apresentar:
● A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;
● A mensagem "Reprovado", se a média for menor do que sete;
● A mensagem "Aprovado com Mérito", se a média for igual a dez.
 */
import java.util.Scanner;
public class Question5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a primeira nota do aluno:");
        double nota1 = input.nextDouble();
        if (nota1 > 10 || nota1 < 0) {
            System.out.println("Valor da nota incorreta!");
        }
        else {
            System.out.println("Digite a segunda nota do aluno:");
            double nota2 = input.nextDouble();
            input.close();
            if (nota2 < 0 || nota2 > 10) {
                System.out.println("Valor da nota incorreta!");
            }
            else {
                double media = (nota1 + nota2) / 2;

                if (media >= 7 & media < 10) {
                    System.out.println("Aluno aprovado!");
                }
                else if (media == 10) {
                    System.out.println("Aluno aprovado com mérito!");
                }
                else {
                    System.out.println("Aluno reprovado!");
                }
            }

        }


    }
    
}
