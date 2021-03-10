public class DishTest {
    public static void main(String[] args) {

        Dish dish1 = new Dish();
        dish1.costInCents = 25;
        dish1.nameOfDish = "Pasta";
        dish1.wouldRecommend = true;

        System.out.println(dish1.printSummary());
        System.out.println(DishTools.shoutDishName(dish1));
        System.out.println(DishTools.analyzeDishCost(dish1));
        System.out.println(DishTools.flipRecommendation(dish1));
    }

}
