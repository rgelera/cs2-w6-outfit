public class Shorts extends Pants {
  public Shorts(String newColor) {
    super(newColor);
  }

  public boolean isFormal() { return false; }
  public boolean isSummerWear() { return true; }
  public boolean isWinterWear() { return false; }
  public boolean isGoodWithEarrings() { return false; }

  public String toString() {
    return color + " shorts";
  }
}
