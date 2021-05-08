public class Slacks extends Pants {
  public Slacks(String newColor) {
    super(newColor);
  }

  public boolean isFormal() { return true; }
  public boolean isSummerWear() { return false; }
  public boolean isWinterWear() { return false; }
  public boolean isGoodWithEarrings() { return true; }

  public String toString() {
    return color + " slacks";
  }
}
