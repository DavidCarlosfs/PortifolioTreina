public class Triangulo extends FormaGeometrica {
    private double _base;
    private double _altura;

    public Triangulo(double base, double altura) {
        this._base = base;
        this._altura = altura;
    }

    @Override
    public double area() {
        return (this.getBase() * getAltura()) / 2;
    }

    @Override
    public double area(double lado) {
        System.out.println("Use área sem parâmetro ou área(base, altura)");
        return lado;
    }
    public double area(double base, double altura) {
        return (base * altura) / 2;
    }

    public double getBase() {
        return this._base;
    }

    public double getAltura() {
        return this._altura;
    }
    
}
