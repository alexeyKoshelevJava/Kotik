package food;

import java.io.IOException;

public class WrongFoodException extends Exception {
    public WrongFoodException() {
        super("Класс еды не соответствует животному");
    }
}
