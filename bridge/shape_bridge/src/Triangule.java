public class Triangule extends Shape{

    public Triangule(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.println("Drawing a triangule");
        this.color.toColor();
    }
}
