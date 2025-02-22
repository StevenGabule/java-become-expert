package fundamental.array.Pixel;

public class Pixel {
  private int red;
  private int green;
  private int blue;

  public Pixel(int red, int green, int blue) {
    this.red = red;
    this.green = green;
    this.blue = blue;
  }

  public Pixel(Pixel other) {
    this.red = other.red;
    this.green = other.green;
    this.blue = other.blue;
  }

  public int getRed() {
    return red;
  }

  public void setRed(int red) {
    this.red = red;
  }

  public int getGreen() {
    return green;
  }

  public void setGreen(int green) {
    this.green = green;
  }

  public int getBlue() {
    return blue;
  }

  public void setBlue(int blue) {
    this.blue = blue;
  }

  @Override
  public String toString() {
    return String.format("(%d, %d, %d)", red, green, blue);
  }
}
