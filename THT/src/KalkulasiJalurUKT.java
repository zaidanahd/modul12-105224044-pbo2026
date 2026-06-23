public enum KalkulasiJalurUKT {
    REGULER(5000000),
    KARYAWAN(7500000),
    INTERNASIONAL(15000000),
    BIDIKMISI(0),
    MBKM(4000000); 

    private final double biaya;

    KalkulasiJalurUKT(double biaya) {
        this.biaya = biaya;
    }

    public double getBiaya() {
        return this.biaya;
    }
}