package exception;

public class JenisLapanganException extends Exception{
    public String message(){
        return "Pilih Salah Satu Jenis Lapangan yang Tersedia !";
    }
}