package exceptions;

public class CustomRunTimeException extends RuntimeException{
    public CustomRunTimeException(){
        super();
    }
    public CustomRunTimeException(String message){
        super(message);
    }
}
