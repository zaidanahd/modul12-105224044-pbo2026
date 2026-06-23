public class CetakKRSManager {
    public void cetakDraftKRS(String mahasiswa, String matakuliah) {
        System.out.println("Proses Cetak PDF...(load data)");
        boolean adaKesalahanFormatKop = true; 
        if (adaKesalahanFormatKop) {
            System.out.println("Format Kop surat gagal! Proses cetak PDF berhenti.");
            return; 
        }
        System.out.println("Draft PDF berhasil dicetak.");
    }
}