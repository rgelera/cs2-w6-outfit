import java.util.Arrays;

abstract class Clothes {
  protected String color;
  
  public Clothes(String newColor) {
    color = newColor;
  }

  public boolean isPlain() {
    String[] plainColors = {"black", "grey", "white"};
    boolean contains = Arrays.stream(plainColors).anyMatch(color::equals);
    return contains;
  }
  
  public boolean isGoodWithDressShoes() {
    return isFormal();
  }

  abstract boolean isFormal();
  // abstract boolean isSummerWear();
  // abstract boolean isWinterWear();
  abstract boolean isGoodWithEarrings();
}
