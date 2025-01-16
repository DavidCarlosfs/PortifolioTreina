/*Supondo que a população de um país A seja da ordem de 80000 habitantes com
uma taxa anual de crescimento de 3% e que a população de B seja 200000
habitantes com uma taxa de crescimento de 1.5%. Faça um programa que calcule e
escreva o número de anos necessários para que a população do país A ultrapasse
ou iguale a população do país B, mantidas as taxas de crescimento. */
// Atividade ainda incompleta, precisando de revisão
public class Question4 {
    public static void main(String[] args) {
    double taxa_crescimenteA = 0.03;
    double taxa_crescimenteB = 0.015;
    int ano_a_mais = 0;
    double pais_a = 80000;
    double pais_b = 200000;

    do {
        if (pais_a <= pais_b) {
            ano_a_mais = ano_a_mais + 1;
            pais_a = pais_a + (pais_a * taxa_crescimenteA);
            pais_b = pais_b + (pais_b * taxa_crescimenteB);   
        }
    }        
    while (pais_a <= pais_b);
    System.out.println("O país A precisará de " + ano_a_mais + " anos para superar a população de país B.");
    }

    
}
