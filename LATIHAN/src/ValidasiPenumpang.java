public class ValidasiPenumpang {
    public static void validasiNIK(String nik) {
        if (nik.length() != 16) {
            throw new DataPenumpangTidakValidException("Error: Panjang NIK harus tepat 16 karakter!");
        }
        if (!nik.matches("[0-9]+")) {
            throw new DataPenumpangTidakValidException("Error: NIK harus berupa angka saja, tidak boleh ada huruf!");
        }
    }
} 
//ini tergabung dalam class ReservasiKontrol, karena berbeda tanggung jawab maka dibuat class baru bernama ValidasiPenumpang(validasi NIK)