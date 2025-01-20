public class Quadrado extends FormaGeometrica {

    private double _lado;

    public Quadrado(double lado) {
        this._lado = lado;
    }
    
    @Override
    public double area() {
        return this.getLado() * getLado();
    }

    @Override
    public double area(double lado) {
        return lado * lado;
    }

    public double getLado() {
        return this._lado;
    }
}