

class Rectangle {
  double length;
  double breadth;
}

class RectangleDemo {
  public static void main(String args[]) {

  Rectangle r1 = new Rectangle();
  Rectangle r2 = r1;

  r1.length = 10;
  r2.length = 20;

  System.out.println("Value of R1's Length : " + r1.length);
  System.out.println("Value of R2's Length : " + r2.length);

  }
}