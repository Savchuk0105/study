
public class Main {
    public static void main(String[] args) {
        Park park = new Park("Сказочный лес");
        park.addAtraction("Колесо обозрения", "10:00 - 20:00", 300);
        park.addAtraction("Американские горки", "11:00 - 19:00", 500);
        park.addAtraction("Карусель", "09:00 - 18:00", 200);
        park.showInfo();
    }
}