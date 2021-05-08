import java.util.ArrayList;

public class TestOutfits {
  public static void main(String[] args) {
    // Wardrobe
    // Tops
    Clothes whiteTShirt = new TShirt("white");
    Clothes blackTShirt = new TShirt("black");
    Clothes blueTShirt = new TShirt("blue");
    Clothes greenSweater = new Sweater("green");
    Clothes whiteDressShirt = new DressShirt("white");
    Clothes blueDressShirt = new DressShirt("blue");
    
    ArrayList<Clothes> tops = new ArrayList<Clothes>();
    tops.add(whiteTShirt);
    tops.add(blackTShirt);
    tops.add(blueTShirt);
    tops.add(greenSweater);
    tops.add(whiteDressShirt);
    tops.add(blueDressShirt);

    // Pants
    Clothes blueJeans = new Jeans("blue");
    Clothes blackJeans = new Jeans("black");
    Clothes blackSlacks = new Slacks("black");
    Clothes brownShorts = new Shorts("brown");
    Clothes blueShorts = new Shorts("blue");

    ArrayList<Clothes> pants = new ArrayList<Clothes>();
    pants.add(blueJeans);
    pants.add(blackJeans);
    pants.add(blackSlacks);
    pants.add(brownShorts);
    pants.add(blueShorts);

    // Shoes
    Clothes blackDressShoes = new DressShoes("black");
    Clothes brownDressShoes = new DressShoes("brown");
    Clothes brownSandals = new Sandals("brown");
    Clothes whiteSneakers = new Sneakers("white");
    Clothes redSneakers = new Sneakers("red");

    ArrayList<Clothes> shoes = new ArrayList<Clothes>();
    shoes.add(blackDressShoes);
    shoes.add(brownDressShoes);
    shoes.add(brownSandals);
    shoes.add(whiteSneakers);
    shoes.add(redSneakers);

    // Outerwear
    Clothes blueWinterCoat = new WinterJacket("blue");
    Clothes greenSpringJacket = new SpringCoat("green");
    Clothes greyPeacoat = new Peacoat("grey");

    ArrayList<Clothes> outerwear = new ArrayList<Clothes>();
    outerwear.add(blueWinterCoat);
    outerwear.add(greenSpringJacket);
    outerwear.add(greyPeacoat);

    // Accessories
    Clothes earrings = new Earrings("gold");
    Clothes rings = new Rings("gold");
    Clothes watch = new Watch("silver");
    Clothes redTie = new Ties("red");
    Clothes blueTie = new Ties("blue");
    Clothes blackBelt = new Belts("black");
    Clothes brownBelt = new Belts("brown");

    ArrayList<Clothes> accessories = new ArrayList<Clothes>();
    accessories.add(earrings);
    accessories.add(rings);
    accessories.add(watch);
    accessories.add(redTie);
    accessories.add(blueTie);
    accessories.add(blackBelt);
    accessories.add(brownBelt);
  
    // Get outfit pieces consecutively one by one while doing updating data about the outfit to adhere to rules
    
    OutfitGenerator og = new OutfitGenerator(tops, pants, shoes, outerwear, accessories);
    
    while (!og.validateOutfit()) {
      og.generateOutfit();
    }
    
    ArrayList<Clothes> generatedOutfit = og.getOutfit();

    for (Clothes curr : generatedOutfit) {
      System.out.println(curr);
    }
  }
}
