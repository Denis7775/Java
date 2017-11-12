package MyTerminal;

public class IncorrectPinException extends Exception {

    @Override
    public String toString() {
        return "Incorrect pin code, try again.";
    }
}
