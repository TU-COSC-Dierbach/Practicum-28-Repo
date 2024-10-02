public class Circle extends Shape {

  public Circle(int size) {
    super(size);
  }

  public double area() {
    return Math.PI * (getSize() * getSize());
  }
}