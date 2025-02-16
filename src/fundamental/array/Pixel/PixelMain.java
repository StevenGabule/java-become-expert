package fundamental.array.Pixel;

import java.util.Arrays;

public class PixelMain {
  public static void main(String[] args) {
    Pixel[][] original = {
        {new Pixel(255, 0, 0), new Pixel(0, 255, 0)}, // Red, Green
        {new Pixel(0, 0, 255), new Pixel(255, 255, 255)} // Blue, White
    };


    // Verify original is unchanged
    System.out.println("Original (unchanged):");
    Arrays.stream(original).forEach(row -> System.out.println(Arrays.toString(row)));
    // Original (unchanged):
    // [(255, 0, 0), (0, 255, 0)]
    // [(0, 0, 255), (255, 255, 255)]

    System.out.println();

    // processed copy
    Pixel[][] grayscale = ImageProcessor.toGrayScale(original);
    System.out.println("Grayscale (changed):");
    Arrays.stream(grayscale).forEach(row -> System.out.println(Arrays.toString(row)));
    // Grayscale (changed):
    // [(85, 85, 85), (85, 85, 85)]
    // [(85, 85, 85), (255, 255, 255)]
  }
}
