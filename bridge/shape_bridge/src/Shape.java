public abstract class Shape {
    private double perimetro;
    private double area;

    Color color;

    public Shape(Color color){
        this.color = color;
    }
    public void setArea(double area) {
        this.area = area;
    }
    public void setPerimetro(double perimetro){
        this.perimetro = perimetro;
    }
    public abstract void draw();
}
