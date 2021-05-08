public class Earrings extends Accessories {
  public Earrings(String newColor) {
    super(newColor);
  }

  public boolean isFormal() { return false; }
  public boolean isGoodWithEarrings() { return true; }

  public String toString() {
    return color + " earrings";
  }
}
