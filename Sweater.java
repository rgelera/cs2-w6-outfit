public class Sweater extends Shirts {
  public Sweater(String newColor) {
    super(newColor);
  }

  public boolean isFormal() { return false; }
  public boolean isSummerWear() { return false; }
  public boolean isWinterWear() { return true; }
  public boolean isGoodWithEarrings() { return true; }

  public String toString() {
    return color + " sweater";
  }
}
