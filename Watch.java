public class Watch extends Accessories {
  public Watch(String newColor) {
    super(newColor);
  }

  public boolean isFormal() { return false; }
  public boolean isGoodWithEarrings() { return true; }

  public String toString() {
    return color + " watch";
  }
}
