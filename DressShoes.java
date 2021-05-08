public class DressShoes extends Shoes {
  public DressShoes(String newColor) {
    super(newColor);
  }

  public boolean isFormal() { return true; }
  public boolean isGoodWithEarrings() { return true; }

  public String toString() {
    return color + " dress shoe";
  }
}
