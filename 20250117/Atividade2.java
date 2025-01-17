/*Uma pesquisa sobre algumas características físicas da população de uma
determinada região coletou os seguintes dados referentes a cada habitante
para serem analisados:

• Sexo (“M” - Masculino, “F” - Feminino)
• Cor dos Olhos (“A”-Azul,”V”-Verde, “C"-Castanho)
• Idade em anos

Para cada habitante foi digitada uma linha com esses dados e a última linha,
que não corresponde a ninguém conterá o valor de idade igual a -1. Fazer um
programa que determine e imprima:
a) A maior idade dos habitantes;
b) A porcentagem de indivíduos do sexo feminino cuja idade está entre 18 e
35 anos inclusive e que tenham olhos verdes; */
import java.util.Scanner;
public class Atividade2 {
    public static void main(String[] args) {

        int contador = 0;
        int maior_idade = 0;
        int cont_pessoas = 0;
        int idade = 0;
        char sexo;
        char cor_olhos;

        Scanner input = new Scanner(System.in);

        while (idade != -1) {

            do {
                System.out.println("Digite o sexo da " + (contador + 1) + "ª pessoa (M para Masculino e F para feminino):");
                sexo = input.next().toUpperCase().charAt(0);
                if (sexo != 'F' && sexo != 'M') {
                    System.out.println("Valor incorreto.");
                }
            }
            while (sexo != 'F' && sexo != 'M');

            do {
                System.out.println("Digite a cor dos olhos da " + (contador + 1) + "ª pessoa (A para azul, V para verde e C para castanho):");
                cor_olhos = input.next().toUpperCase().charAt(0);
                if (cor_olhos != 'V' && cor_olhos != 'C' && cor_olhos != 'A') {
                    System.out.println("Valor incorreto!");
                }
            }
            while (cor_olhos != 'V' && cor_olhos != 'C' && cor_olhos != 'A');


            System.out.println("Digite a idade, em números, da " + (contador + 1) + "ª pessoa ou -1 para sair:");
            idade = input.nextInt();
                
            if (idade >= maior_idade) {
                maior_idade = idade;
            } else if (idade == -1) {
                break;
            }                

            contador += 1;

            if (sexo == 'F' && cor_olhos == 'V' && idade >= 18 && idade <= 35) {
                cont_pessoas += 1;

            }

            }

            input.close();

            double porcentagem = cont_pessoas / 100;

            System.out.println("Maior idade dos habitantes: " + maior_idade);
            System.out.println("Porcentagem de pessoas do sexo femino, com olhos verdes e de idade entre 18 e 35 anos: " + porcentagem + "%");

    
    }
    
}
