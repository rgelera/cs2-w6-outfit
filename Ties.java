public class Ties extends Accessories {
  public Ties(String newColors) {
    super(newColors);
  }

  public boolean isFormal() { return true; }
  public boolean isSummerWear() { return false; }
  public boolean isWinterWear() { return false; }
  public boolean isGoodWithEarrings() { return false; }

  public String toString() {
    return color + " tie";
  }
}
