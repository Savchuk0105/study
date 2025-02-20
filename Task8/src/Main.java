import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        String poem = "Вот пример стихотворения для анализа";
        String[] words = poem.toLowerCase().split("\\s+");

        if (words.length == 0) {
            System.out.println("Стихотворение пустое.");
            return;
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
        if (commonLetters.isEmpty()) {
            System.out.println("Нет общих букв во всех словах.");
        } else {
            System.out.println("Общие буквы во всех словах: " + commonLetters);
        }
    }
}