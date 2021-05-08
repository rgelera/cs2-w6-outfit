public class TShirt extends Shirts {
  public TShirt(String newColor) {
    super(newColor);
  }

  public boolean isFormal() { return false; }
  public boolean isGoodWithEarrings() { return true; }

  public String toString() {
    return color + " t-shirt";
  }
}
