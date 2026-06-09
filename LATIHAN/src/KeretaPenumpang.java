public class KeretaPenumpang implements Kereta, DapatDipesan {
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
    
    @Override
    public String getKodeKereta() { 
        return kodeKereta; 
    }
    @Override
    public String getNamaKereta() { 
        return namaKereta; 
    }
    @Override
    public String getRute() { 
        return rute; 
    }
}