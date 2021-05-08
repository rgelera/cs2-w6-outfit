public class Sandals extends Shoes {
  public Sandals(String newColor) {
    super(newColor);
  }
  
  public boolean isFormal() { return false; }
  public boolean isGoodWithEarrings() { return false; }

  public String toString() {
    return color + " sandal";
  }
}
