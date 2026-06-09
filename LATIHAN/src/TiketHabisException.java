public class TiketHabisException extends Exception {
    private String namaKereta;
    private int sisaKursi;

    public TiketHabisException(String namaKereta, String message, int sisaKursi) {
        super(message);
        this.namaKereta = namaKereta;
        this.sisaKursi = sisaKursi;
    }
    
    public String getNamaKereta() {
        return namaKereta;
    }
    
    public int getSisaKursi() {
        return sisaKursi;
    }
}