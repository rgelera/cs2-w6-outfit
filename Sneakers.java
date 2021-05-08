public class Sneakers extends Shoes {
  public Sneakers(String newColor) {
    super(newColor);
  }

  public boolean isFormal() { return false; }
  public boolean isSummerWear() { return false; }
  public boolean isWinterWear() { return false; }
  public boolean isGoodWithEarrings() { return true; }

  public String toString() {
    return color + " sneakers";
  }
}
