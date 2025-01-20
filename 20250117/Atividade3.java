/*Tem-se um conjunto de dados contendo altura e sexo (“M” ou “F”)
de 50 pessoas, fazer um programa que calcule e escreva:
a) a maior e a menor altura do grupo
b) média de altura das mulheres
c) o número de homens */
import java.util.Scanner;
public class Atividade3 {


    public static void main(String[] args) {
        double altura_grupo = 0;
        double media_mulheres;
        int cont_homens = 0;
        int cont_mulheres = 0;
        int contador = 0;
        char sexo;
        int soma_feminino = 0;
        double maior_altura = 0;
        double menor_altura = 0;
        Scanner input = new Scanner(System.in);
        do {
            do {
                System.out.println("Informe o sexo da " + (contador + 1) + "ª pessoa (F para feminino e M para masculino):");
                sexo = input.next().toUpperCase().charAt(0);
                if (sexo != 'F' && sexo != 'M') {
                    System.out.println("Valor incorreto.");
                } else if (sexo == 'M') {
                    cont_homens += 1;
                }
            }
            while (sexo != 'F' && sexo != 'M');

            do {
                System.out.println("Informe a altura da " + (contador + 1) + "ª pessoa:");
                altura_grupo = input.nextDouble();
                if (altura_grupo < 0) {
                    System.out.println("Valor incorreto.");
                } else if (altura_grupo > maior_altura) {
                    maior_altura = altura_grupo;
                }
                if (menor_altura == 0) {
                    menor_altura = maior_altura;
                } else if (altura_grupo < menor_altura) {
                    menor_altura = altura_grupo;
                }

            }
            while (altura_grupo < 0);
            contador += 1;
            if (sexo == 'F') {
                cont_mulheres += 1;
                soma_feminino += altura_grupo;
            }
        }
        while (contador < 5);
        input.close();
        media_mulheres = soma_feminino / cont_mulheres;

        System.out.println("Maior altura do grupo: " + maior_altura);
        System.out.println("Menor altura do grupo: " + menor_altura);
        System.out.println("Média de altura das mulheres: " + media_mulheres);
        System.out.println("Número de homens: " + cont_homens);
        System.out.println(soma_feminino);
    }
    
}
