public class DishTest {

    public static void main(String[] args) {

        Dish dish1 = new Dish(25, "Pasta", true);

        System.out.println(dish1.printSummary());
        System.out.println(DishTools.shoutDishName(dish1));
        System.out.println(DishTools.analyzeDishCost(dish1));
        System.out.println(DishTools.flipRecommendation(dish1));
    }

}
