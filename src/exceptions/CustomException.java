package exceptions;

public class CustomException extends Exception {
    CustomException(){
        super();
    }

    CustomException(String message){
        super(message);
    }
}
