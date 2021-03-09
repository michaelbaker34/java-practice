import java.util.Locale;

public class DishTools {

    public static int AVERAGE_COST_OF_DISH_IN_CENTS = 1300;

    public static void shoutDishName(Dish dish) {
        String dishName = dish.nameOfDish;
        System.out.println(dishName.toUpperCase());
    }

    public static void analyzeDishCost(Dish dish) {
        int dishCost = dish.costInCents;
        if (dishCost > AVERAGE_COST_OF_DISH_IN_CENTS) {
            System.out.println("More expensive than average.");
        } else {
            System.out.println("Less expensive than average");
        }
    }

    public static void flipRecommendation(Dish dish) {
        dish.wouldRecommend = !dish.wouldRecommend;
        System.out.println(dish.wouldRecommend);
    }

}
