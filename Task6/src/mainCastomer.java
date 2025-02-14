public class mainCastomer implements  Customer{
    private String personalData;
    private boolean activeContract;

    @Override
    public void createContract() {
        this.activeContract = true;
        System.out.println("Договор оформлен.");
    }

    @Override
    public void updatePersonalData(String data) {
        this.personalData = data;
        System.out.println("Персональные данные обновлены.");
    }

    @Override
    public void addPurchase(String purchase) {
        System.out.println("Покупка добавлена: " + purchase);
    }

    @Override
    public void receivePayment(double amount) {
        System.out.println("Оплата получена: " + amount);
    }

    @Override
    public void addDiscount(double discount) {
        System.out.println("Скидка добавлена: " + discount + "%");
    }

    @Override
    public void terminateContract() {
        this.activeContract = false;
        System.out.println("Договор расторгнут.");
    }

    @Override
    public void renewContract() {
        this.activeContract = true;
        System.out.println("Договор возобновлен.");
    }
}
