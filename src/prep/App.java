package prep;

import prep.Foods.*;
import java.util.ArrayList;

public class App {

    public static void main(String[] args) {

//        int[] arr = {1, 2, 3};
//        System.out.println(Arithmetic.getAverage(arr));

        FoodTools.initializeApp();

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