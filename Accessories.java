abstract class Accessories extends Clothes {
  public Accessories(String newColor) {
    super(newColor);
  }

  abstract boolean isFormal();
  abstract boolean isSummerWear();
  abstract boolean isWinterWear();
  abstract boolean isGoodWithEarrings();
}
