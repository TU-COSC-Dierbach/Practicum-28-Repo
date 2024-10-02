public class Square extends Shape {

  public Square(int size) {
    super(size);
  }

  public double area() {
    return (getSize() * getSize());
  }
}