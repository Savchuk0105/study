import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        try {
            // Создание новой директории
            File dir = new File("outputDir");
            if (!dir.exists()) {
                dir.mkdir();
            }

            // Создание нового файла в директории
            File inputFile = new File("input.txt");
            File outputFile = new File(dir, "output.txt");

            // Чтение из исходного файла
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));

            String line;
            while ((line = reader.readLine()) != null) {
                // Удаление слов с 3 до 5 символов
                String processedLine = removeWords(line);
                writer.write(processedLine);
                writer.newLine();
            }

            reader.close();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String removeWords(String line) {
        Pattern pattern = Pattern.compile("\\b\\w{3,5}\\b");
        Matcher matcher = pattern.matcher(line);
        StringBuffer sb = new StringBuffer();

        int count = 0;
        while (matcher.find()) {
            count++;
        }
        matcher.reset();

        int removeCount = (count / 2) * 2; // Максимальное четное количество слов для удаления
        int removed = 0;

        while (matcher.find()) {
            if (removed < removeCount) {
                matcher.appendReplacement(sb, "");
                removed++;
            } else {
                matcher.appendReplacement(sb, matcher.group());
            }
        }
        matcher.appendTail(sb);

        return sb.toString();
    }
}