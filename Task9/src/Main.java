import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Main processor = new Main();
            processor.processFile("numbers.txt");
        } catch (FileNotFoundException e) {
            System.err.println("Файл не найден: " + e.getMessage());
        } catch (InvalidNumberFormatException e) {
            System.err.println("Ошибка формата числа: " + e.getMessage());
        } catch (OutOfMemoryError e) {
            System.err.println("Недостаточно памяти: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Произошла ошибка: " + e.getMessage());
        }
    }

    public void processFile(String filename) throws FileNotFoundException, InvalidNumberFormatException {
        File file = new File(filename);
        Scanner scanner = new Scanner(file);
        scanner.useLocale(Locale.US);

        double sum = 0.0;
        int count = 0;

        while (scanner.hasNext()) {
            if (scanner.hasNextDouble()) {
                double number = scanner.nextDouble();
                sum += number;
                count++;
            } else {
                String token = scanner.next();
                throw new InvalidNumberFormatException("Некорректное число: " + token);
            }
        }

        scanner.close();

        if (count > 0) {
            double average = sum / count;
            System.out.println("Сумма чисел: " + sum);
            System.out.println("Среднее значение: " + average);
        } else {
            System.out.println("В файле нет корректных чисел.");
        }
    }
}