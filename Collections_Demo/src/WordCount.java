import java.util.*;

public class WordCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word: ");
        String word = sc.nextLine();
        String[] words = word.split(" ");

        HashMap<String, Integer> wordMap = new HashMap<>();
        for (String word1 : words) {
            wordMap.put(word1, wordMap.getOrDefault(word1, 0) + 1);
        }

        wordMap.forEach((key, value) -> System.out.println(key + " : " + value));
    }
}
