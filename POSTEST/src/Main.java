public class Main {
    public static void main(String[] args) {
        OrderRepository repository = new OrderRepository();
        EmailNotifier emailSystem = new EmailSystem();
        
        System.out.println("Transaksi 1: pakai Credit Card ");
        PaymentMethod creditCard = new CreditCard();
        OrderService orderService1 = new OrderService(repository, creditCard, emailSystem);
        orderService1.checkout(150000);
        ((RefundablePayment) creditCard).refund(150000);
         
        System.out.println("\nTransaksi 2: pakai Gift Voucher ");
        PaymentMethod voucher = new GiftVoucher();
        OrderService orderService2 = new OrderService(repository, voucher, emailSystem);
        orderService2.checkout(50000);
    }
}