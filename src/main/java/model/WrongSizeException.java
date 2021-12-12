package model;

public class WrongSizeException extends RuntimeException {

    public WrongSizeException() {
        super("Размер вольера не соответствует размеру животного");
    }
}
