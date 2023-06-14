package exception;

public class JenisKaryawanException extends Exception{
    public String message(){
        return "Pilih Salah Satu Jenis Karyawan yang Tersedia !";
    }
}
