public class GiftVoucher implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Memproses pembayaran menggunakan Gift Voucher sebesar: " + amount);
    }
}