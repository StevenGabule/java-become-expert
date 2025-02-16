package fundamental.LearnClass;

public class AddMeth {
  public static void main(String[] args) {
    Vehicle minivan = new Vehicle(6, 16, 21);
    Vehicle sportscar = new Vehicle(2, 14, 12);
    double gallons;
    int dist = 252;
    int range1, range2;

    System.out.println("Minivan can carry " + minivan.passengers + ". ");
    // Minivan can carry 6.

    minivan.range();
    // Range is: 336

    range1 = minivan.totalRange();
    System.out.println("Minivan can carry " + minivan.passengers + ". with a range " + range1);
    // Minivan can carry 6. with a range 37

    range2 = sportscar.totalRange();
    System.out.println("Sportscar can carry " + minivan.passengers + ". with a range " + range2);
    // Sportscar can carry 6. with a range 26

    gallons = minivan.fuelNeeded(dist);
    System.out.println("To go " + dist + " miles minivan needs " + gallons + " gallons of fuel.");
    // To go 252 miles minivan needs 12.0 gallons of fuel.

    gallons = sportscar.fuelNeeded(dist);
    System.out.println("To go " + dist + " miles sportscar needs " + gallons + " gallons of fuel.");
    // To go 252 miles sportscar needs 21.0 gallons of fuel.
  }
}
