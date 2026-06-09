public class OVO implements RefundablePayment {
    @Override
    public void pay(double amount) {
        System.out.println("Memproses pembayaran OVO via API OVO sebesar: " + amount);
    }

    @Override
    public void refund(double amount) {
        System.out.println("Refund OVO sebesar: " + amount);
    }
}