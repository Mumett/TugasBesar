package exception;

public class InputKosongJamException extends Exception{
    public String message(){
        return "FIELD INPUT TIDAK BOLEH KOSONG!";
    }    
}
