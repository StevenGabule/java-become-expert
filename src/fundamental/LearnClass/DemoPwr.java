package fundamental.LearnClass;

public class DemoPwr {
  public static void main(String[] args) {
    Pwr x = new Pwr(4.0, 2);
    Pwr y = new Pwr(2.5, 1);
    Pwr z = new Pwr(5.7, 0);

    System.out.println(x.b + " raised to the " + x.e + " power is " + x.get_pwr());
    // 4.0 raised to the 2 power is 16.0

    System.out.println(y.b + " raised to the " + y.e + " power is " + y.get_pwr());
    // 2.5 raised to the 1 power is 2.5

    System.out.println(z.b + " raised to the " + z.e + " power is " + z.get_pwr());
    // 5.7 raised to the 0 power is 1.0
  }
}
