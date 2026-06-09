public class Main {
    public static void main(String[] args) {
        Buku bukuSains = new Buku();
        bukuSains.judul = "Pemrograman Java Lanjut";
        bukuSains.hariKeterlambatan = 5;

        LayananDenda kalkulatorStandar = new KalkulatorDendaStandar();
        PemformatStruk formatTabel = new FormatStrukTabel();

        PengelolaPerpustakaan perpus = new PengelolaPerpustakaan(kalkulatorStandar, formatTabel);

        String hasilStruk = perpus.prosesPengembalian(bukuSains);
        System.out.println(hasilStruk);
    }
}


interface LayananDenda {
    double hitungDenda(int hariKeterlambatan);
}

interface PemformatStruk {
    String buatTampilan(Buku buku, double totalDenda);
}


class KalkulatorDendaStandar implements LayananDenda {
    @Override
    public double hitungDenda(int hariKeterlambatan) {
        return hariKeterlambatan > 0 ? hariKeterlambatan * 2000.0 : 0.0;
    }
}

class KalkulatorDendaFlat implements LayananDenda {
    @Override
    public double hitungDenda(int hariKeterlambatan) {
        return hariKeterlambatan > 0 ? 15000.0 : 0.0; 
    }
}

class FormatStrukTabel implements PemformatStruk {
    @Override
    public String buatTampilan(Buku buku, double totalDenda) {
        return "=====================================\n" +
               "|            STRUK DENDA            |\n" +
               "=====================================\n" +
               "| Judul Buku : " + buku.judul + "\n" +
               "| Total Denda: Rp " + totalDenda + "\n" +
               "=====================================";
    }
}

class FormatStrukJson implements PemformatStruk {
    @Override
    public String buatTampilan(Buku buku, double totalDenda) {
        return "{\n  \"judul\": \"" + buku.judul + "\",\n  \"denda\": " + totalDenda + "\n}";
    }
}

class Buku {
    public String  judul;
    public int hariKeterlambatan;
}

class PengelolaPerpustakaan {
    private LayananDenda layananDenda;
    private PemformatStruk pemformatStruk;

    public PengelolaPerpustakaan(LayananDenda layananDenda, PemformatStruk pemformatStruk) {
        this.layananDenda = layananDenda;
        this.pemformatStruk = pemformatStruk;
    }

    public Buku cariBuku(String judul) {
        return new Buku(); 
    }

    public void prosesPeminjaman(String idAnggota, Buku buku) {
    }

    public String prosesPengembalian(Buku buku) {
        double denda = layananDenda.hitungDenda(buku.hariKeterlambatan);
        return pemformatStruk.buatTampilan(buku, denda);
    }
}