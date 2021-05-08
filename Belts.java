public class Belts extends Accessories {
  public Belts(String newColor) {
    super(newColor);
  }

  public boolean isFormal() { return true; }
  public boolean isSummerWear() { return false; };
  public boolean isWinterWear() { return false; };
  public boolean isGoodWithEarrings() { return true; }

  public String toString() {
    return color + " belt";
  }
}
