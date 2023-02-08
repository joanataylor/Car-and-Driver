public class Driver extends Car {
  public Driver() {
    super();
  }

  public void drive() {
    gas -= 1;
    status();
  }

  public void useBoosters() {
    gas -= 3;
    status();
  }

  public void refuel() {
    gas += 2;
    status();
  }
}
