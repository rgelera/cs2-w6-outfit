abstract class Outerwear extends Clothes {
  public Outerwear(String newColor) {
    super(newColor);
  }

  abstract boolean isFormal();
  abstract boolean isGoodWithEarrings();
}