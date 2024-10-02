class Main {
  public static void main(String[] args) {
    Shape s = null;
    int size = 10;
    int which;

    // selection of Shape type wanted
    which = 2;
    
    switch (which) {
      case 1: s = new Circle(size); break;
      case 2: s = new Square(size); break;
    }

    // method calls to the object in variable s
    // will behave properly based on the current
    // object type assigned to it
    System.out.println(s.area());

   }
}