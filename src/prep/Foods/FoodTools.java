package prep.Foods;

import java.util.*;

public class FoodTools {

    public static void initializeApp () {
        int caloriesConsumed = addFoods(getFoods());
        System.out.printf("Total calories consumed: %s", caloriesConsumed);
    }

    public static ArrayList<Food> getFoods() {
        return new ArrayList<>(Arrays.asList(
        new Dinner("pizza", "good", 500, true),
        new Dinner("taco", "also good", 300, false),
        new Dinner("burger", "really good", 750, true)));
    }

    public static int addFoods(ArrayList<Food> foods) {
        Scanner sc = new Scanner(System.in);
        int caloriesConsumed = 0;

        for (Food food : foods) {
            System.out.println(getPrintableString(food.getFullDescription()));
            System.out.println("Would you like to eat this? [y/n]");

            String response = sc.nextLine().toLowerCase();
            if (response.equals("y")) {
                food.consume();
                caloriesConsumed += food.getCalories();
            }
        }
        return caloriesConsumed;
    }

    public static String getPrintableString(ArrayList<String> strings) {
        StringBuilder printableString = new StringBuilder();

        for (String string : strings) {
            printableString.append(string).append("\n");
        }
        printableString.append("----------");
        return printableString.toString();
    }

}