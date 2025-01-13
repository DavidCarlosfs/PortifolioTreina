/*Faça um programa que leia e valide as seguintes informações:
a. Nome: maior que 3 caracteres;
b. Idade: entre 0 e 150;
c. Salário: maior que zero;
d. Sexo: 'f' ou 'm';
e. Estado Civil: 's', 'c', 'v', 'd'. */
import java.util.Scanner;
public class Question3 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String nome;
    int idade;
    double salario;
    char sexo;
    char estado_civil;
    
    do {
        System.out.println("Digite o seu nome (minimo 3 letras):");
        nome = input.next();
        if (nome.length() <= 3) {
            System.out.println("Quantidade de caracteres inválidas, por favor digite novamente:");
        }
    }
    while (nome.length() > 3);
    System.out.println("Olá, " + nome);

    do {
        System.out.println("Agora digite a sua idade (0 - 150):");
        idade = input.nextInt();
        if (idade < 0 || idade > 150) {
            System.out.println("Idade inválida, por favor digite uma idade entre 0 e 150:");
        }
    }
    while (idade >= 0 && idade <= 150);
    System.out.println("Olá, " + nome + ", você tem " + idade + " anos.");

    do {
        System.out.println("Informe o seu salário (maior que 0):");
        salario = input.nextDouble();
        if (salario < 0) {
            System.out.println("Salário inválido, por favor digite um salário maior que 0:");
        }
    }
    while (salario >= 0);
    System.out.println("Olá, " + nome + ", você tem " + idade + " anos e ganha R$" + salario);

    do {
        System.out.println("Informe o seu sexo (m - Masculino; f - Feminino):");
        sexo = input.next().toLowerCase().charAt(0);
        if (sexo != 'f' || sexo != 'm') {
            System.out.println("Valor incorreto. Por favor digite f para Feminino ou m para Maculino:");
        }
    }
    while ( sexo == 'f' || sexo == 'm');
    if (sexo == 'f') {
        System.out.println("Olá, " + nome + ", você tem " + idade + " anos, ganha R$" + salario + " e é do sexo feminino");
    }
    else {
        System.out.println("Olá, " + nome + ", você tem " + idade + " anos, ganha R$" + salario + " e é do sexo masculino.");
    }
    do {
        System.out.println("Por fim informe o seu estado civil (s - Solteiro; c - Casado; v - Viúvo; s - Separado):");
        estado_civil = input.next().toLowerCase().charAt(0);
        if (estado_civil != 's' || estado_civil != 'c' || estado_civil != 'v' || estado_civil != 'd') {
            System.out.println("Valor incorreto! Por favor informe s se Solteiro, c se Casado, v de Viúvo ou s de Separado:");
        }
    }
    while (estado_civil == 's' || estado_civil == 'c' || estado_civil == 'v' || estado_civil == 'd');
    if (estado_civil == 's') {
        System.out.println("Olá, " + nome + ", você tem " + idade + " anos, ganha R$" + salario + ", é do sexo masculino e é solteiro/a");
    } else if (estado_civil == 'c') {
        System.out.println("Olá, " + nome + ", você tem " + idade + " anos, ganha R$" + salario + ", é do sexo masculino e é casado/a");
    } else if (estado_civil == 'v') {
        System.out.println("Olá, " + nome + ", você tem " + idade + " anos, ganha R$" + salario + ", é do sexo masculino e é viúvo/a");
    }
    else {
        System.out.println("Olá, " + nome + ", você tem " + idade + " anos, ganha R$" + salario + ", é do sexo masculino e é divorciado/a");
    }
    }
}
