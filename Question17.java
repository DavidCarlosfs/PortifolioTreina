/*Questão 17: Cálculo de peso ideal I
 * Tendo como dados de entrada a altura de uma pessoa, construa um
 * algoritimo que calcule seu peso ideal, usando a seguinte fórmula:
 * (72.7 * altura) - 58.
 */
import java.util.Scanner;
public class Question17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a altura:");
        double altura_pessoa = input.nextDouble();

        double peso_ideal = (72.7 * altura_pessoa) - 58;

        System.out.println("O peso ideal para a altura informada é de " + peso_ideal + "kg.");

        input.close();
    }
    
}
