import java.util.ArrayList;
import java.util.Random;

public class OutfitGenerator {
  private ArrayList<Clothes> outfit;
  private ArrayList<Clothes> wardrobeTops;
  private ArrayList<Clothes> wardrobePants;
  private ArrayList<Clothes> wardrobeShoes;
  private ArrayList<Clothes> wardrobeOuterwear;
  private ArrayList<Clothes> wardrobeAccessories;

  public OutfitGenerator(ArrayList<Clothes> tops, ArrayList<Clothes> pants, ArrayList<Clothes> shoes, ArrayList<Clothes> outerwear, ArrayList<Clothes> accessories) {
    outfit = new ArrayList<Clothes>();
    wardrobeTops = tops;
    wardrobePants = pants;
    wardrobeShoes = shoes;
    wardrobeOuterwear = outerwear;
    wardrobeAccessories = accessories;
  }

  /* Rules
    - The shirt, pants, and shoes should not all be plain
    - A shirt that is not good with dress shoes shouldn’t be worn with dress shoes
    - A winter jacket shouldn’t be worn with shorts
    - A tie shouldn’t be worn with jeans
    - Blue and green together should be avoided
    - Belt color and dressshoe color must match
   */

  // check if top, pants, and shoes are not plain. (Black, grey, white)
  public boolean isNotPlain() {
    for (int i = 0; i < 3; i++) {
      if (outfit.get(i).isPlain()) {
        return false;
        // is plain so doesn't pass
      }
    }
    return true;
  }

  public boolean isGoodWithDressShoes() {
    boolean result = true;
    if (outfit.get(2) instanceof DressShoes) {
      for (Clothes c : outfit) {
        result = result && c.isGoodWithDressShoes();
      }
    }
    return result; // no dress shoes so doesn't matter
  }

  public boolean contradictingWeather() {
    boolean summer = false;
    boolean winter = false;
    for (Clothes c : outfit) {
      summer = summer || c.isSummerWear();
      winter = winter || c.isWinterWear();
    }
    // if both true, contradicting clothing
    if (summer && winter) {
      return false;
    } else {
      return true;
    }
  }

  public boolean validateOutfit() {
    System.out.println("--- Validating outfit ---");
    if (outfit.isEmpty()) {
      return false;
    }
    boolean validated = isNotPlain() 
      && isGoodWithDressShoes()
      && contradictingWeather();
    
    return validated;
  }

  public ArrayList<Clothes> getOutfit() {
    return outfit;
  }

  public void generateOutfit() {
    System.out.println("--- Generating outfit ---");
    outfit.clear();
    outfit.add(getRandomFromList(wardrobeTops));
    outfit.add(getRandomFromList(wardrobePants));
    outfit.add(getRandomFromList(wardrobeShoes));
    outfit.add(getRandomFromList(wardrobeOuterwear));
    outfit.add(getRandomFromList(wardrobeAccessories));
  }

  public Clothes getRandomFromList(ArrayList<Clothes> clothingType) {
    Random rand = new Random();
    return clothingType.get(rand.nextInt(clothingType.size()));
  }
}
