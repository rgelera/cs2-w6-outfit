public class Rings extends Accessories {
  public Rings(String newColor) {
    super(newColor);
  }

  public boolean isFormal() { return false; }
  public boolean isGoodWithEarrings() { return true; }

  public String toString() {
    return color + " rings";
  }
}
