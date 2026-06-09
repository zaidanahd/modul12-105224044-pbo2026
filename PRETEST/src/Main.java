public class Main {
    public static void main(String[] args) {
        PengelolaPerpustakaan perpus = new PengelolaPerpustakaan();
        
        Buku bukuSains = new Buku();
        bukuSains.judul = "Belajar SOLID Java";
        bukuSains.hariKeterlambatan = 5; 

        String hasilStruk = perpus.prosesPengembalian(bukuSains);
        System.out.println(hasilStruk);
    }
}

class Buku {
    public String judul;
    public int hariKeterlambatan;
}

class KalkulatorDenda {
    public double hitung(int hariKeterlambatan) {
        return hariKeterlambatan * 2000.0;
    }
}

class FormatStrukTabel {
    public String buatTampilan(Buku buku, double totalDenda) {
        return "=====================================\n" +
               "|            STRUK DENDA            |\n" +
               "=====================================\n" +
               "| Judul Buku : " + buku.judul + "\n" +
               "| Total Denda: Rp " + totalDenda + "\n";
    }
}

class PengelolaPerpustakaan {
    private KalkulatorDenda kalkulator = new KalkulatorDenda();
    private FormatStrukTabel pemformat = new FormatStrukTabel();

    public Buku cariBuku(String judul) {
        return new Buku(); 
    }

    public void prosesPeminjaman(String idAnggota, Buku buku) {
    }

    public String prosesPengembalian(Buku buku) {
        double denda = kalkulator.hitung(buku.hariKeterlambatan);
        return pemformat.buatTampilan(buku, denda);
    }
}