public class OrderService {
    private OrderRepository repository;
    private PaymentMethod paymentMethod;
    private EmailNotifier emailNotifier;

    public OrderService(OrderRepository repository, PaymentMethod paymentMethod, EmailNotifier emailNotifier) {
        this.repository = repository;
        this.paymentMethod = paymentMethod;
        this.emailNotifier = emailNotifier;
    }

    public void checkout(double amount) {
        repository.saveOrder();      // buat SRP
        paymentMethod.pay(amount);   // buat OCP dan LSP
        emailNotifier.sendEmail();   // buat ISP
    }
}