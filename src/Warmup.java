import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Warmup {

    // create a static method, secondListIsOneMore, that returns a boolean based on two passed
// lists of integers. If each integer in the second list is one more than the integer at the same
// index in the first list, the method will return true and false otherwise. Assume both lists are
// the same length.
//
//        Examples:
//        ... 1, 2, 3 and 2, 3, 4 returns true
//        ... 1, 3, 6 and 2, 4, 7 returns true
//        ... -5, 10, -200 and -4, 11, -199 returns true
//        ... 1, 2, 3 and 2, 3, 5 returns false

//    public static boolean secondListIsOneMore(List<Integer> lOne, List<Integer> lTwo) {
//        for (int i = 0; i < lOne.size(); i += 1) {
//            if (lOne.get(i) + 1 != lTwo.get(i)) {
//                return false;
//            }
//        }
//        return true;

        public static boolean secondListIsOneMore(List<Integer> lOne, List<Integer> lTwo) {
            for (int i = 0; i < lOne.size(); i++) {
                if (lTwo.get(i) == (lOne.get(i) + 1)) {
                    return true;
                }
            }
            return false;
        }


        
//    Write a method named firstChar() that takes a string as an input
//    and returns the first letter as a character data type.

        public static Character firstChar(String input) {
            Character firstLetter = input.charAt(0);
            return firstLetter;
        } 

    public static void main(String[] args) {

        // List<Integer> lOne = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        // List<Integer> lTwo = new ArrayList<>(Arrays.asList(2, 3, 4, 5));
        // List<Integer> lThree = new ArrayList<>(Arrays.asList(3, 4, 5, 6));
        // System.out.println(secondListIsOneMore(lOne, lTwo)); // return true
        // System.out.println(secondListIsOneMore(lOne, lThree)); // return false
        // System.out.println(secondListIsOneMore(lTwo, lThree)); // return true

        System.out.println(firstChar("word")); // return "w"

//        System.out.println(firstChar("bob"));
//        System.out.println(secondChar("bob"));
//        System.out.println(lastChar("bob"));
//        System.out.println(secondToLastChar("bob"));
//        userWantsToContinue();

//        List<Integer> numbers = new ArrayList<>(Arrays.asList(
//                1,
//                2,
//                3
//        ));
//        System.out.println(numbers);
//        numbers.add(4);
//        System.out.println(numbers);
//        System.out.println(numbers.get(0));
//        numbers.add(0, 3);
//        System.out.println(numbers);
//        numbers.remove(0);
//        System.out.println(numbers);
    }

//    public static char firstChar(String input) {
//        return input.charAt(0);
//    }

//    Write a method named secondChar() that takes a string as an input
//    and returns the first letter as a character data type.

//    public static char secondChar(String input) {
//        return input.charAt(1);
//    }

//    Write a method named lastChar() that takes a string as an input
//    and returns the last letter as a character data type.

//    public static char lastChar(String input) {
//        return input.charAt(input.length() - 1);
//    }

//    Write a method named secondToLastChar() that takes a string as an input
//    and returns the second to last letter as a character data type.

//    public static char secondToLastChar(String input) {
//        return input.charAt(input.length() - 2);
//    }

//    Write a method named userWantsToContinue().
//    This method should prompt the user if they want to continue
//    and then return a boolean value if the user inputs "y" or "yes".

//    public static Boolean userWantsToContinue() {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Continue?: [yes/no]");
//        String input = sc.next().toLowerCase();
//        return input.startsWith("y");
//    }

//    Write a method named isEven() that takes in an integer
//    and returns a boolean if the input is even or not.


//    Write a method named isOdd() that takes in an integer
//    and returns a boolean if the input is odd or not.


//    Write a method named countOdds(start, end)
//    that returns an integer containing the integer that is the count of
//    all odd numbers between the start and the end input integers.


//    Write a method named countEvens(start, end) that returns an integer
//    containing the integer that is the count of all even numbers
//    between the start and the end input integers.


//    Write a method named isVowel() that accepts a String input of length 1
//    and returns a boolean if that string is a vowel other than "y".


//    Write a method named hasVowels() that accepts a string of any length
//    and returns a boolean if there are any vowels in that string.


//    Write a method named countVowels() that accepts a string of any length
//    and returns an integer count of the number of vowel
//    in the provided input String.


//    Write a solution to FizzBuzz using recursion instead of a loop.


//    Write a method named isPrime() that that accepts in an integer number
//    and returns a boolean if the number is evenly divisible
//    only by either 1 or the number itself.


//    Write a method named getTwentyPrimes() that returns a string
//    containing the first 20 prime numbers, each separated by a comma.
//    Output: "1, 2, 3, 5, 7, 11, 13, 17, 19"...
//    until we have a total count of 20 primes in the string.


}
