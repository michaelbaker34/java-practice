
public class DishTools {

    public static int AVERAGE_COST_OF_DISH_IN_CENTS = 50;

    public static String shoutDishName(Dish dish) {
        return dish.getNameOfDish().toUpperCase();
    }

    public static String analyzeDishCost(Dish dish) {
        int dishCost = dish.getCostInCents();
        if (dishCost > AVERAGE_COST_OF_DISH_IN_CENTS) {
            return "More expensive than average.";
        } else {
            return "Less expensive than average";
        }
    }

    public static boolean flipRecommendation(Dish dish) {
        return !dish.getWouldRecommend();
    }

}