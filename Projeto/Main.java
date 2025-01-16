public class Main {
    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado(5);
        Triangulo triangulo = new Triangulo(5,4);

        System.out.println("Quadrado sem parâmetro " + quadrado.area());
        System.out.println("Quadrado com parâmetro " + quadrado.area(7));

        System.out.println("Triângulo sem parâmetro " + triangulo.area());
        System.out.println("Triângulo com parâmetro " + triangulo.area(5));
        System.out.println("Triângulo com base e altura " + triangulo.area(5, 8));
    }
    
}
