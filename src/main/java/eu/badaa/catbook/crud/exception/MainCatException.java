package eu.badaa.catbook.crud.exception;

import lombok.*;

@Getter
@Setter
@ToString
public class MainCatException extends RuntimeException {

    public MainCatException() {
    }

    public MainCatException(String message) {
        super(message);
    }

    public MainCatException(String message, Throwable cause) {
        super(message, cause);
    }

    public MainCatException(Throwable cause) {
        super(cause);
    }

    public MainCatException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
