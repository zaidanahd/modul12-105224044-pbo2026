public class Main {
    public static void main(String[] args) {
        CetakKRSManager printer = new CetakKRSManager();
        String mhs = "Ahmad Zaidan";
        String matkul = "Desain Arsitektur Perangkat Lunak";

        System.out.println("--- DEMO 1: SISTEM LAMA (MYSQL + REGULER) ---");
        DatabaseConnection mysql = new MySQLDatabaseConnection();
        SistemKRSManager skenarioLama = new SistemKRSManager(mysql, printer);
        skenarioLama.prosesKRS(mhs, matkul, KalkulasiJalurUKT.REGULER);

        System.out.println("\n\n");

        System.out.println("--- DEMO 2: TUNTUTAN BARU (CLOUD NOSQL + MBKM) ---");
        DatabaseConnection nosql = new CloudNoSQLDatabaseConnection();
        SistemKRSManager skenarioBaru = new SistemKRSManager(nosql, printer);
        skenarioBaru.prosesKRS(mhs, matkul, KalkulasiJalurUKT.MBKM);
    }
}