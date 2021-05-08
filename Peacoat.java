public class Peacoat extends Outerwear {
  public Peacoat(String newColor) {
    super(newColor);
  }

  public boolean isFormal() { return true; }
  public boolean isGoodWithEarrings() { return true; }

  public String toString() {
    return color + " peacoat";
  }
}