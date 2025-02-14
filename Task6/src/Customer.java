public interface Customer {
    void createContract(); // Оформить договор
    void updatePersonalData(String data); // Изменить персональные данные
    void addPurchase(String purchase); // Добавить покупку
    void receivePayment(double amount); // Получить оплату
    void addDiscount(double discount); // Добавить скидку
    void terminateContract(); // Расторгнуть договор
    void renewContract(); // Возобновить договор
}
