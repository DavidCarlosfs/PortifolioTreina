package EstruturaCondicional;
/*Questão 16: Raízes de Equação de 2o Grau
Faça um programa que calcule as raízes de uma equação do segundo grau, na
forma ax2 + bx + c. O programa deverá pedir os valores de a, b e c e fazer as
verificações, informando ao usuário nas seguintes situações:
a. Se o usuário informar o valor de a igual a zero, a equação não é do segundo grau
e o programa não deve fazer pedir os demais valores, sendo encerrado;
b. Se o delta calculado for negativo, a equação não possui raízes reais. Neste caso,
informe ao usuário e encerre o programa;
c. Se o delta calculado for igual a zero a equação possui apenas uma raiz real.
Calcule essa raiz e imprima seu valor para o usuário;
d. Se o delta for positivo, a equação possui duas raízes reais. Calcule-as e imprima
seus valores para o usuário. */

import java.util.Scanner;
public class Question16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();

        if (a == 0) {
            System.out.println("O valor de 'a' é zero. a equação não é do segundo grau.");
            input.close();
            System.exit(0);
        }
        System.out.println("Digite o valor de b:");
        double b = input.nextDouble();

        System.out.println("Digite o valor de c:");
        double c = input.nextDouble();

        double delta = Math.pow(b,2) - (4 * a * c);

        if (delta < 0) {
            System.out.println("O delta é negativo. A equação não possui raízes reais");
            System.exit(0);
        } else if (delta == 0) {
            double raizunica = -b / (2*a);
            System.out.printf("O delta é zero. A equação possui uma única raíz real: %2.f%n", raizunica);
        }
        else {
            double raiz1 = (-b + Math.sqrt(delta)) / (2*a);
            double raiz2 = (-b + Math.sqrt(delta)) / (2*a);
            System.out.printf("O delta é positivo. A equação possui duas raízes reais: %n");
            System.out.printf("Raiz 1: %.2%n", raiz1);
            System.out.printf("Raiz 1: %.2%n", raiz2);
        }
        input.close();
    }
    
}
