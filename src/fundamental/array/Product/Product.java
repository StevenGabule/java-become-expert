package fundamental.array.Product;

public class Product {
  private final String category;
  private final String name;
  private final double price;
  private final double rating;

  public Product(String category, String name, double price, double rating) {
    this.category = category;
    this.name = name;
    this.price = price;
    this.rating = rating;
  }

  public String getCategory() { return category; }
  public double getPrice() { return price; }
  public double getRating() { return rating; }
  public String getName() { return name; }

  @Override
  public String toString() {
    return String.format("[%s] %s - $%.2f ★ %.1f", category, name, price, rating);
  }
}
