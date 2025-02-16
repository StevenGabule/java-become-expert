package fundamental.array.Pixel;

public class ImageProcessor {
  public static Pixel[][] deepCopy(Pixel[][] original) {
    Pixel[][] copy = new Pixel[original.length][];
    for(int i = 0; i < original.length; i++) {
      copy[i] = new Pixel[original[i].length];
      for(int j = 0; j < original[i].length; j++) {
        copy[i][j] = new Pixel(original[i][j]);
      }
    }
    return copy;
  }

  // Apply grayscale filter to a copy (preserve original)
  public static Pixel[][] toGrayScale(Pixel[][] original) {
    Pixel[][] grayscale = deepCopy(original);
    for (Pixel[] row : grayscale) {
      for(Pixel pixel : row) {
        int avg = (pixel.getRed() + pixel.getGreen() + pixel.getBlue()) / 3;
        pixel.setRed(avg);
        pixel.setGreen(avg);
        pixel.setBlue(avg);
      }
    }

    return grayscale;
  }
}
