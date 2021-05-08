abstract class Shoes extends Clothes {
  public Shoes(String newColor) {
    super(newColor);
  }

  abstract boolean isFormal();
  abstract boolean isGoodWithEarrings();
}
