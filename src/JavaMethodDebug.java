public class JavaMethodDebug {

    // TODO: Fix the method below to work as expected.
    //  The method should take in a string and character and return the number of instances of the passed character in the string.
    public static int countLetters(String input, char character) {
        int charCount = 0;
        for (int i = 0; i < input.length(); i += 1) {
            if (input.toLowerCase().charAt(i) == Character.toLowerCase(character)) {
                charCount++;
            }
        }
        return charCount;
    }

    public static void main(String[] args) {
        int numberOfSs = countLetters("MissiSSippi", 's');
        int numberOfIs = countLetters("MissISSippi", 'i');
        System.out.printf("# of s's: %d%n", numberOfSs); // should return 4
        System.out.printf("# of i's: %d%n", numberOfIs); // return 4
    }
}