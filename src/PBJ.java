public class PBJ {
/*
    kitchenTool
        knife
        plate
    superclass extends knife, plate
        boolean isClean;
        boolean isDisposable;
        String location;
        use();
    Ingredients
        Jelly
        PeanutButter
        Bread
    superclass extends jelly, peanutbutter, bread
        boolean edible;
        boolean expired;
        eat();
    superclass extends kitchen tool ingredients
        String location = kitchen;
        Double mass;
        makeSandwich();
*/

/*
        Create Java classes for the following:
      KitchenTool
        Knife (should extend from KitchenTool)
        Plate (should extend from KitchenTool)
      Ingredient
        Jelly (should extend from Ingredient)
        PeanutButter (should extend from Ingredient)
        Bread (should extend from Ingredient)
    Add the variables and methods (two each per class) to the classes.
    The methods can be void.sout simple messages about what the method is doing.
*/

/*
    - add a void method, throwAway, to your Ingredient class that souts out "Throwing away ingredient..."
    - override the method, throwAway, in your Jelly, PeanutButter, and Bread classes to sout out a more specific message (e.g. "Throwing away Jelly...", etc.)
    - add another method to the KitchenTool class and override it in the Knife and Plate classes.
*/

/*
    - add a protected integer property to Ingredient of calories
    - add a method to the Jelly class that prints out the calories
    - does the code work if you change the visibility of the calories to public? Private?
    - create a package called "jelly" and place the Jelly class in it and experiment with public, private, protected visibility for calories
 */

/*
    - add a constructor to KitchenTool that sets all properties
    - resolve the compile error in the subclasses by adding a default constructor to KitchenTool
    - remove the default constructor and add a constructor to the child classes that calls the super constructor and sets the child class properties for Knife and Plate
*/

/*
    - create a class, IngredientTest, that has a main method
    - add a static void method, throwAwayIngredient that takes in an Ingredient instance and invokes the throwAway method
    - instantiate an instance of Jelly, PeanutButter, and Bread stored in type Ingredient
    - call the throwAwayIngredient() method multiple times passing various instances of the above ingredients
*/

    public static void main(String[] args) {

    }

}
