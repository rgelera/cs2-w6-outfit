## WIP - still implementing more rules

### Object Heirarchy
```
Clothes => Tops         => TShirt
                        => Sweater
                        => DressShirt
        => Pants        => Jeans
                        => Slacks
                        => Shorts
        => Shoes        => DressShoes
                        => Sandals
                        => Sneakers
        => Outerwear    => WinterCoat
                        => SpringJacket
                        => Peacoat
        => Accessories  => Earrings
                        => Rings
                        => Watch
                        => Ties
                        => Belts
```
I chose to have specific types of clothing (TShirt, sweater, etc) to be subclasses as I wanted to create boolean methods to specify traits for each type. 

### Characteristics to check
- Formal vs casual
- Seasonal wear
- Plain vs colourful

### Rules
- The shirt, pants, and shoes should not all be plain
- A shirt that is not good with dress shoes shouldn’t be worn with dress shoes
- A winter jacket shouldn’t be worn with shorts
- A tie shouldn’t be worn with jeans
- Blue and green together should be avoided
- Belt color and dressshoe color must match
