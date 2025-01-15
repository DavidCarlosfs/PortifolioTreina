/*Altere o programa anterior permitindo ao usuário informar as populações e as taxas
de crescimento iniciais. Valide a entrada e permita repetir a operação. */
import java.util.Scanner;
public class Question5 {
    public static void main(String[] args) {
        double taxa_crescimenteA;
        double pais_a = 0;
        double taxa_crescimenteB;
        double pais_b = 0;
        char resposta = ' ';

        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Você deseja repetir a operação?");
            resposta = input.next().toLowerCase().charAt(0);
            if (resposta == 's') {
                do { 

                    do {
                        System.out.println("Digite a taxa de crescimento do 1º país:");
                        taxa_crescimenteA = input.nextDouble();
                        taxa_crescimenteA = taxa_crescimenteA / 100;   
                        if (taxa_crescimenteA < 0) {
                            System.out.println("Valor inválido, por favor informe o valor correto:");
                        }        
                    }
                    while (taxa_crescimenteA < 0);

                    do { 
                        System.out.println("Agora informe a quantidade populacional do 1º país:");
                        pais_a = input.nextInt();     
                        if (pais_a < 0) {
                            System.out.println("Valor inválido, por favor informe o valor correto:");
                        }

                    } while (pais_a < 0);
                    double crescimento_a = pais_a * taxa_crescimenteA;

                    do {
                    System.out.println("Digite a taxa de crescimento do 2º país:");
                    taxa_crescimenteB = input.nextDouble();
                    taxa_crescimenteB = taxa_crescimenteB / 100;  
                    if (taxa_crescimenteB < 0) {
                        System.out.println("Valor inválido, por favor informe o valor correto:");
                    }         
                    if (taxa_crescimenteB == taxa_crescimenteA) {
                        System.out.println("Os valores das taxas são iguais, portanto ambas crescerão juntas, por favor repita o processo com novos valores.");
                        
                    }
                    }
                    while (taxa_crescimenteB < 0 || taxa_crescimenteB == taxa_crescimenteA);

                    do {

                    System.out.println("Agora informe a quantidade populacional do 2º país:");
                    pais_b = input.nextInt();  
                    if (pais_b < 0) {
                        System.out.println("Valor inválido, por favor informe o valor correto:");
                    }
                    }
                    while (pais_b < 0);
                    double crescimento_b = pais_b * taxa_crescimenteB;            

                if (pais_a == pais_b && taxa_crescimenteA == taxa_crescimenteB) {
                    System.out.println("As taxas e a população dos dois países são iguais, portanto o crecimento será paralelo.");
                    System.out.println("Por favor, repita o processo.");
                }
        } while (pais_a == pais_b && taxa_crescimenteA == taxa_crescimenteB);                
            } else if (resposta == 'n') {
                System.out.println("Obrigado por usar o nosso programa.");
                break;
            }
            else {
                System.out.println("Valor incorreto, por favor responda novamente:");
            }
        }
        while (resposta != 's' || resposta != 'n');
        input.close();
        }


    }
