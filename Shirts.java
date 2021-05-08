abstract class Shirts extends Clothes {
  public Shirts(String newColor) {
    super(newColor);
  }

  abstract boolean isFormal();
  abstract boolean isSummerWear();
  abstract boolean isWinterWear();
  abstract boolean isGoodWithEarrings();
}
