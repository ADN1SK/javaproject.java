// funtion that takes in a string and returns the number of vowels in the string

public class Main {
    public static void main(String[] args) {
        String str = "A quick brown fox jumps over the lazy dog and it stares at it";
        int count = countVowels(str);
        System.out.println("Number of vowels in the string: " + count);
    }

    public static int countVowels(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O'
                    || c == 'U') {
                count++;
            }
        }
        
        return count;
        
    }
}






// This code defines a Main class with a main method that initializes a string and calls the countVowels function to count the number of vowels in the string. The countVowels function iterates through each character in the string and checks if it is a vowel (both uppercase and lowercase). If it is a vowel, it increments the count variable. Finally, it returns the total count of vowels found in the string.
