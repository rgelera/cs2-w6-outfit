abstract class Pants extends Clothes {
  public Pants(String newColor) {
    super(newColor);
  }

  abstract boolean isFormal();
  abstract boolean isSummerWear();
  abstract boolean isWinterWear();
  abstract boolean isGoodWithEarrings();
}
