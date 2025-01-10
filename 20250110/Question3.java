/*Utilizando estruturas condicionais
 * Construa um algorítimo para determinar se o indivíduo está com um peso 
 * favorável ou não. Essa situação é determinada através do IMC (Índice de
 * Massa Corpórea), que é definida como sendo a relação entre o peso (PESO)
 * e o quadrado da Altura (ALTURA) do indivíduo.
 * condição:
 * IMC abaixo de 20 => Abaixo do peso
 * IMC de 20 até 25 => Peso normal
 * IMC de 25 até 30 => Sobre peso
 * IMC de 30 até 40 => Obeso
 * IMC de 40 e acima => Obeso mórbido
 * Cálculo:
 * IMC = PESO / ALTURA²
 */
import java.util.Scanner;
public class Question3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe a sua altura em centímetros:");
        int altura = input.nextInt();
        System.out.println("Informe o seu peso em kg:");
        double peso = input.nextDouble();
        input.close();

        double calculo_imc = (peso / (altura * altura)) * 10000;

        if (calculo_imc < 20) {
            System.out.println("Abaixo do peso.");
        } else if (calculo_imc >= 20 & calculo_imc <= 25) {
            System.out.println("Peso normal.");
        } else if (calculo_imc >= 25.01 & calculo_imc <= 30) {
            System.out.println("Sobre peso.");
        } else if (calculo_imc >= 30.01 & calculo_imc <= 40) {
            System.out.println("Obeso/a.");
        }
        else {
            System.out.println("Obesidade mórbida.");
        }
    }
    
}
