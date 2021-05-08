abstract class Shirts extends Clothes {
  public Shirts(String newColor) {
    super(newColor);
  }

  abstract boolean isFormal();
  abstract boolean isGoodWithEarrings();
}
