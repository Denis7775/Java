package MyTerminal;

public class TerminalServer implements Terminal{
    private int amountOfMoney = 0;
    private String password = "Nagibator5000";

    public String getPassword() {
        return password;
    }

    @Override
    public int checkAccount() {
        return amountOfMoney;
    }

    @Override
    public void putMoney(int sum) {
        amountOfMoney += sum;
    }

    @Override
    public void getMoney(int sum) {
        amountOfMoney -= sum;
    }
}
