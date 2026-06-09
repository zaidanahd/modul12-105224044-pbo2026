public class CreditCard implements RefundablePayment {
    @Override
    public void pay(double amount) {
        System.out.println("Memproses pembayaran Credit Card via API Bank sebesar: " + amount);
    }

    @Override
    public void refund(double amount) {
        System.out.println("Refund Credit Card sebesar: " + amount);
    }
}