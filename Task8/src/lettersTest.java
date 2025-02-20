import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Set;
import java.util.HashSet;

public class lettersTest {

    @Test
    public void testCommonLettersExist() {
        String poem = "Вот пример стихотворения для анализа";
        Set<Character> expected = new HashSet<>();

        Set<Character> actual = Main.findCommonLetters(poem);
        assertEquals(expected, actual, "Ожидалось, что общих букв нет");
    }

    @Test
    public void testNoCommonLetters() {
        String poem = "Каждый охотник желает знать";
        Set<Character> expected = new HashSet<>();

        Set<Character> actual = Main.findCommonLetters(poem);
        assertEquals(expected, actual, "Ожидалось, что общих букв нет");
    }

    @Test
    public void testEmptyPoem() {
        String poem = "";
        Set<Character> expected = new HashSet<>();

        Set<Character> actual = Main.findCommonLetters(poem);
        assertEquals(expected, actual, "Ожидалось пустое множество для пустого стихотворения");
    }

    @Test
    public void testSingleWord() {
        String poem = "стихотворение";
        Set<Character> expected = new HashSet<>();
        for (char c : poem.toCharArray()) {
            if (Character.isLetter(c)) {
                expected.add(c);
            }
        }

        Set<Character> actual = Main.findCommonLetters(poem);
        assertEquals(expected, actual, "Ожидалось множество букв из одного слова");
    }
}