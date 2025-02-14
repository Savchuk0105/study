
public class Main {
    public static void main(String[] args) {
        // Создание обычного покупателя
        Customer customer = new mainCastomer();
        customer.createContract();
        customer.addPurchase("Телевизор");
        customer.receivePayment(1000.0);
        customer.terminateContract();

        // Создание оптового покупателя
        Wholesale wholesaleCustomer = new Wholesale(15.0);
        wholesaleCustomer.createContract();
        wholesaleCustomer.addPurchase("Партия телевизоров");
        wholesaleCustomer.applyWholesaleDiscount();
        wholesaleCustomer.receivePayment(5000.0);

        // Создание VIP-покупателя
        Vip vipCustomer = new Vip("Gold");
        vipCustomer.createContract();
        vipCustomer.addPurchase("Элитный телевизор");
        vipCustomer.applyVipPrivilege();
        vipCustomer.receivePayment(2000.0);
    }
}