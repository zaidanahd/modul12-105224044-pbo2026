// Kontrak umum untuk semua jenis kereta
public interface Kereta {
    String getKodeKereta();
    String getNamaKereta();
    String getRute();
    int getSisaKursi();
    void setSisaKursi(int i);

}