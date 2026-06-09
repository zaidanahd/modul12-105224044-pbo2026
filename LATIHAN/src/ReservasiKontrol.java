import java.util.ArrayList;

public class ReservasiKontrol {
    private ArrayList<Kereta> daftarKereta;

    public ReservasiKontrol(ArrayList<Kereta> dataAwal) {
        this.daftarKereta = dataAwal;
    }

    public ArrayList<Kereta> getDaftarKereta() {
        return daftarKereta;
    }

    public Kereta cariKereta(String kode) {
        for (Kereta k : daftarKereta) {
            if (k.getKodeKereta().equalsIgnoreCase(kode)) {
                return k;
            }
        }
        return null;
    }
    
    public void pesanTiket(String kode, String nik, String nama, int jumlahTiket) 
        throws RuteTidakDitemukanException, TiketHabisException {

        ValidasiPenumpang.validasiNIK(nik);

        Kereta keretaDipilih = cariKereta(kode);
        if (keretaDipilih == null) { 
            throw new RuteTidakDitemukanException("Error: Kode kereta '" + kode + "' tidak ditemukan."); 
        }

        if (jumlahTiket > keretaDipilih.getSisaKursi()) {
            throw new TiketHabisException(keretaDipilih.getNamaKereta(), "Error: Kursi tidak mencukupi.", keretaDipilih.getSisaKursi());
        }

        keretaDipilih.setSisaKursi(keretaDipilih.getSisaKursi() - jumlahTiket);

    }
}