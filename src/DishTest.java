public class DishTest {
    public static void main(String[] args) {

        Dish dish1 = new Dish();
        dish1.costInCents = 25;
        dish1.nameOfDish = "Pasta";
        dish1.wouldRecommend = true;

        dish1.printSummary();
        DishTools.shoutDishName(dish1);
        DishTools.analyzeDishCost(dish1);
        DishTools.flipRecommendation(dish1);
    }

}
