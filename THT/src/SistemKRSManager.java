public class SistemKRSManager {
    private final DatabaseConnection db; 
    private final CetakKRSManager printer; 

    public SistemKRSManager(DatabaseConnection db, CetakKRSManager printer) {
        this.db = db;
        this.printer = printer;
    }

    public boolean validasiPrasyaratMataKuliah(String mahasiswa, String matakuliah) {
        System.out.println("Memvalidasi prasyarat akademik untuk " + mahasiswa);
        return true; 
    }

    public void prosesKRS(String mahasiswa, String matakuliah, KalkulasiJalurUKT jalur) {
        validasiPrasyaratMataKuliah(mahasiswa, matakuliah);

        double totalUKT = jalur.getBiaya();
        System.out.println("Total UKT Terhitung = Rp " + totalUKT);

        db.simpanKRS(mahasiswa, matakuliah);

        printer.cetakDraftKRS(mahasiswa, matakuliah);
    }
}