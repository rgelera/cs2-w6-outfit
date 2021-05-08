public class WinterJacket extends Outerwear {
  public WinterJacket(String newColor) {
    super(newColor);
  }

  public boolean isFormal() { return false; }
  public boolean isSummerWear() { return false; }
  public boolean isWinterWear() { return true; }
  public boolean isGoodWithEarrings() { return false; }

  public String toString() {
    return color + " winter jacket";
  }
}
