package fundamental;

public class CastDemo {
  public static void main(String[] args) {
    double x, y;
    byte b;
    int i;
    char ch;

    x = 10.0;
    y = 3.0;

    i = (int)(x / y);
    System.out.println("Integer outcome of x / y: " + i); // Integer outcome of x / y: 3

    i = 100;
    b = (byte) i;
    System.out.println("Value of B: " + b ); // Value of B: 100

    b = 88;
    ch = (char) b;
    System.out.println("CH " + ch); // CH X
  }
}
