import java.util.*;

public class Main {
    public static Set<Character> findCommonLetters(String poem) {
        String[] words = poem.toLowerCase().split("\\s+");

        if (words.length == 0) {
            return new HashSet<>();
        }
        Set<Character> commonLetters = new HashSet<>();
        for (char c : words[0].toCharArray()) {
            if (Character.isLetter(c)) {
                commonLetters.add(c);
            }
        }
        for (int i = 1; i < words.length; i++) {
            Set<Character> currentLetters = new HashSet<>();
            for (char c : words[i].toCharArray()) {
                if (Character.isLetter(c)) {
                    currentLetters.add(c);
                }
            }
            commonLetters.retainAll(currentLetters);
            if (commonLetters.isEmpty()) {
                break;
            }
        }

        return commonLetters;
    }

    public static void main(String[] args) {
        String poem = "Вот пример стихотворения для анализа";
        Set<Character> commonLetters = findCommonLetters(poem);

        if (commonLetters.isEmpty()) {
            System.out.println("Нет общих букв во всех словах.");
        } else {
            System.out.println("Общие буквы во всех словах: " + commonLetters);
        }
    }
}