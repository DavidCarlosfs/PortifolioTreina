package EstruturaCondicional;
/*Questão 18: Validação de Data
Faça um programa que peça uma data no formato dd/mm/aaaa e determine se a
mesma é uma data válida. */
import java.util.Scanner;
public class Question18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite uma data no formato dd/mm/aaaa");
        String data = input.nextLine();

        String [] partes = data.split("/");
        if (partes.length != 3) {
            System.out.println("Formato inválido. use o formato dd/mm/aaaa.");
            input.close();
        }

        try {
            int dia = Integer.parseInt(partes[0]);
            int mes = Integer.parseInt(partes[1]);
            int ano = Integer.parseInt(partes[2]);


        }
         bj
    public static boolean dataValida(int dia, int mes, int ano) {
        if (mes < 1 || mes > 12) {
            return false;
        }
        }

        
    }
    
}
