public class Main {
    public static void main(String[] args) {
        System.out.println(sum(1, 2.5, 3.7f, 4L, (short) 5, (byte) 6));
    }
    public static double sum(Object... elements) {
        double total = 0.0;

        for (Object element : elements) {
            if (element instanceof Integer) {
                total += (Integer) element;
            } else if (element instanceof Double) {
                total += (Double) element;
            } else if (element instanceof Float) {
                total += (Float) element;
            } else if (element instanceof Long) {
                total += (Long) element;
            } else if (element instanceof Short) {
                total += (Short) element;
            } else if (element instanceof Byte) {
                total += (Byte) element;
            } else {
                throw new IllegalArgumentException("Неподдерживаемый тип: " + element.getClass().getSimpleName());
            }
        }

        return total;
    }
}