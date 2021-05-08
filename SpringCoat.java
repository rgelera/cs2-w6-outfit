public class SpringCoat extends Outerwear {
  public SpringCoat(String newColor) {
    super(newColor);
  }

  public boolean isFormal() { return false; }
  public boolean isGoodWithEarrings() { return false; }

  public String toString() {
    return color + " spring coat";
  }
}
