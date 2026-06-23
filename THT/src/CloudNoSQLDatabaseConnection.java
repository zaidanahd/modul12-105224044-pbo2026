public class CloudNoSQLDatabaseConnection implements DatabaseConnection {
    @Override
    public void simpanKRS(String mahasiswa, String matakuliah) {
        System.out.println("Menghubungkan ke Cloud NoSQL Server (Scalable)...");
        System.out.println("KRS Mahasiswa " + mahasiswa + " dengan kelas [" + matakuliah + "] sukses masuk NoSQL Document.");
    }
}