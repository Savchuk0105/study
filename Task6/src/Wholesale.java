public class Wholesale extends mainCastomer{
    private double wholesaleDiscount;

    public Wholesale(double wholesaleDiscount) {
        this.wholesaleDiscount = wholesaleDiscount;
    }

    public void applyWholesaleDiscount() {
        System.out.println("Оптовая скидка применена: " + wholesaleDiscount + "%");
    }
}
