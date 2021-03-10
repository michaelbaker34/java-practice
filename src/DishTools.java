import java.util.Locale;

public class DishTools {

    public static int AVERAGE_COST_OF_DISH_IN_CENTS = 1300;

    public static String shoutDishName(Dish dish) {
        return dish.nameOfDish.toUpperCase();
    }

    public static String analyzeDishCost(Dish dish) {
        int dishCost = dish.costInCents;
        if (dishCost > AVERAGE_COST_OF_DISH_IN_CENTS) {
            return "More expensive than average.";
        } else {
            return "Less expensive than average";
        }
    }

    public static boolean flipRecommendation(Dish dish) {
        dish.wouldRecommend = !dish.wouldRecommend;
        return dish.wouldRecommend;
    }

}
