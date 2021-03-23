package prep.Foods;

import java.util.Collection;

public abstract class Food implements Consumable {

    private String name;
    private String description;
    private int calories;

    public Food(String name, String description, int calories) throws IllegalArgumentException{

        if (name == null || name.equals("")) {
            throw new IllegalArgumentException(String.format("Invalid argument: %s%n", name));
        }

        if (description == null || description.equals("")) {
            throw new IllegalArgumentException(String.format("Invalid argument: %s%n", name));
        }

        if (calories < 0) {
            throw new IllegalArgumentException(String.format("Invalid argument: %s%n", name));
        }

        this.name = name;
        this.description = description;
        this.calories = calories;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getCalories() {
        return calories;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

// implement methods from interface
    public void consume() {
        System.out.printf("*eating: %s%n", name);
        System.out.println("----------");
    }

}