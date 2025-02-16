package fundamental.LearnClass;

public class Vehicle {
  int passengers;
  int fuelcap;
  int mpg;

  Vehicle(int passengers, int fuelcap, int mpg) {
    this.passengers = passengers;
    this.fuelcap = fuelcap;
    this.mpg = mpg;
  }

  void range(){
    System.out.println("Range is: "  + (fuelcap * mpg));
  }

  int totalRange() {
    return mpg + fuelcap;
  }

  double fuelNeeded(int miles) {
    return (double)miles / mpg;
  }
}

