package exception;

public class StatusLapanganException extends Exception{
    public String message(){
        return "Pilih Salah Satu Status Lapangan yang Tersedia !";
    }
}