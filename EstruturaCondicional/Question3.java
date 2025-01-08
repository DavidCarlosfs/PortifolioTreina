package EstruturaCondicional;
/*Questão 3: Masculino ou feminino
 * Faça um programa que verifique se uma letra digitada é "F" ou "M". Conforme a
letra digitada pelo usuário, o programa deve imprimir: F - Feminino, M - Masculino,
ou Sexo Inválido.
 */
import java.util.Scanner;
public class Question3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o sexo (F para feminino e M para masculino):");
        char sexo = input.next().toUpperCase().charAt(0);
        input.close();

        if (sexo == 'F') {
            System.out.println("O sexo é F - Feminino.");
        }
        else if (sexo == 'M') {
            System.out.println("O sexo é M - Masculino.");
        }
        else {
            System.out.println("Valor informado não reconhecido.");
        }



    }
    
}
