public class Dish {

    public int costInCents;
    public String nameOfDish;
    public boolean wouldRecommend;

    public String printSummary() {
        return String.format("Cost: 0.%d¢ \nName: %s \nRecommended: %b\n",
                            costInCents, nameOfDish, wouldRecommend);
    }


}
