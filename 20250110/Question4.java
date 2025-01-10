/*Faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As
 * perguntas são:
 * "Telefonou para a vítima?"
 * "Esteve no local do crime?"
 * "Mora perto da vítima?"
 * "Devia para a vítima?"
 * "Já trabalhou com a vítima?"
 * O programa deve no final emitir uma classificação sobre a participação
 * da pessoa no crime. Se a pessoa responder positivamente a 2 questões ela
 * deve ser classificada como "Suspeita", entre 3 e 4 como "Cúmplice" e 5
 * como "Assassino". Caso contrário ela será classificada como "Inocente".
 */
import java.util.Scanner;
public class Question4 {
    public static void main(String[] args) {
        int contador = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Responda as seguintes perguntas com 'S' para sim e 'N' para não.");
        System.out.println("Você telefonou para a vítima?");
        char pergunta1 = input.next().toUpperCase().charAt(0);
        if (pergunta1 == 'S') {
            contador = contador + 1;
        }
        System.out.println("Você esteve no local do crime?");
        char pergunta2 = input.next().toUpperCase().charAt(0);
        if (pergunta2 == 'S') {
            contador = contador + 1;
        }
        System.out.println("Você mora perto da vítima?");
        char pergunta3 = input.next().toUpperCase().charAt(0);
        if (pergunta3 == 'S') {
            contador = contador + 1;
        }
        System.out.println("Você devia para a vítima?");
        char pergunta4 = input.next().toUpperCase().charAt(0);
        if (pergunta4 == 'S') {
            contador = contador + 1;
        }
        System.out.println("Você já trabalhou para a vítima?");
        char pergunta5 = input.next().toUpperCase().charAt(0);
        if (pergunta5 == 'S') {
            contador = contador + 1;
        }

        if (contador == 2) {
            System.out.println("Suspeito!");
        } else if (contador == 3 || contador == 4) {
            System.out.println("Cúmplice!");
        } else if (contador == 5) {
            System.out.println("Assassino!");
        }
        else {
            System.out.println("Inocente!");
        }

    }
    
}
