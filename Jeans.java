public class Jeans extends Pants {
  public Jeans(String newColor) {
    super(newColor);
  }

  public boolean isFormal() { return false; }
  public boolean isGoodWithEarrings() {return true; }

  public String toString() {
    return color + " jeans";
  }
}
