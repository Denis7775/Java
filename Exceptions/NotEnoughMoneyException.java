package MyTerminal;

public class NotEnoughMoneyException extends Exception {

    @Override
    public String toString() {
        return "Not enough money on your account.";
    }
}
