public abstract class Shape {
  private int size;

  public Shape(int size){
    this.size = size;
  }

  public int getSize(){
    return size;
  }

  public abstract String getName();
  public abstract double area();
  public abstract int perimeter();
  public abstract int numVertices();
  public abstract boolean isPolygon();
}