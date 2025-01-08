package EstruturaCondicional;
/*Questão 4: Vogal ou consoante
 * Faça um programa que verifique se uma letra digitada é vogal ou consoante.
 */
import java.util.Scanner;
public class Question4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a letra a ser avaliada:");
        char letra = input.next().toUpperCase().charAt(0);
        input.close();

        if (Character.isLetter(letra)) {
            if (letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U') {
            System.out.println("Esta letra é uma vogal!");
        }

            else {
                System.out.println("Esta letra é uma consoante");
        }
        
        }
        else {
            System.out.println("O valor digitado não é uma letra.");
        }
    }
    
}
