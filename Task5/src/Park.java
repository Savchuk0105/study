import java.util.ArrayList;
import java.util.List;

class Park {
    private String parkName;
    private List<Attraction> attractions;

    public Park(String parkName) {
        this.parkName = parkName;
        this.attractions = new ArrayList<>();
    }

    class Attraction {
        private String nameAttration;
        private String timeWork;
        private double price;

        public Attraction(String nameAttration, String timeWork, double price) {
            this.nameAttration = nameAttration;
            this.timeWork = timeWork;
            this.price = price;
        }

        @Override
        public String toString() {
            return "Аттракцион: " + nameAttration + ", Время работы: " + timeWork + ", Стоимость: " + price + " руб.";
        }
    }

    public void addAtraction(String nameAtraction, String timeWork, double price) {
        Attraction newAttraction = new Attraction(nameAtraction, timeWork, price);
        attractions.add(newAttraction);
    }

    public void showInfo() {
        System.out.println("Парк: " + parkName);
        for (Attraction attraction : attractions) {
            System.out.println(attraction);
        }
    }
}