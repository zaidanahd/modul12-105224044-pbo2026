public class KeretaBarang implements Kereta {
    private String kodeKereta;
    private String namaKereta;
    private String rute;
   

    public KeretaBarang(String kodeKereta, String namaKereta, String rute) {
        this.kodeKereta = kodeKereta;
        this.namaKereta = namaKereta;
        this.rute = rute;
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

  @Override
    public int getSisaKursi() {
        return 0; 
    }

    @Override
    public void setSisaKursi(int i) {
    }
}