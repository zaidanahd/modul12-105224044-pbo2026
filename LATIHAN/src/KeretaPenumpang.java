public class KeretaPenumpang implements DapatDipesan {
    private String kodeKereta;
    private String namaKereta;
    private String rute;
    private int sisaKursi;

    public int getSisaKursi() { 
        return sisaKursi; 
    }
    public void setSisaKursi(int sisaKursi) { 
        this.sisaKursi = sisaKursi; 
    }
}