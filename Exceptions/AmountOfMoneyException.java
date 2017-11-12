package MyTerminal;

public class AmountOfMoneyException extends Exception {

    @Override
    public String toString() {
        return "Ante is not a divisor of 100, try another ante.";
    }
}
