/*Questão 18: Cálculo de Peso Ideal II
 * Tendo como dado de entrada a altura (h) de uma pessoa, construa um
 * algoritimo que calcule seu peso ideal, utilizando as seguintes fórmulas:
 * a. Para homens: (72.7*h) - 58
 * b. Para mulheres: (62.1*h) - 44.7
 */
import java.util.Scanner;
public class Question18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe a altura da pessoa:");
        double altura_pessoa = input.nextDouble(); 

        /*Usando o método imperativo
        double homem = (72.7 * altura_pessoa) - 58;
        double mulher = (62.1 * altura_pessoa) - 44.7;

        System.out.println("Se a pessoa for homem o peso ideal é de " + homem + "kg.");
        System.out.println("Se a pessoa for mulher o peso ideal é de " + mulher + "kg."); */

        System.out.println("A pessoa é um homem ou uma mulher?");
        System.out.println("Se for homem digite H, se for mulher M");
        char sexo = input.next().toUpperCase().charAt(0); 

        //Usando estrutura condicional
        if (sexo == 'H') {
            double homem = (72.7 * altura_pessoa) - 58;
            System.out.println("O peso ideal para este homem é de " + homem + "kg.");
        }
        else if (sexo == 'M') {
            double mulher = (62.1 * altura_pessoa) - 44.7;
            System.out.println("O peso ideal para esta mulher é de " + mulher + "kg.");
        }
        else {
            System.out.println("O valor digitado não encontrado em nosso banco de dados.");
        }

        /*Usando o Switch-case
        if (null == sexo) {
            System.out.println("O valor digitado não corresponde no banco de dados.");
        }
        else switch (sexo) {
            case "H":
                double homem = (72.7 * altura_pessoa) - 58;
                System.out.println("O peso ideal para este homem é de " + homem + "kg.");
                break;
            case "M":
                double mulher = (62.1 * altura_pessoa) - 44.7;
                System.out.println("O peso ideal para esta mulher é de " + mulher + "kg.");
                break;
            default:
                System.out.println("O valor digitado não corresponde no banco de dados.");
                break;
        }*/

        input.close();
    }
    
}
