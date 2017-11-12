package MyTerminal;

public class TerminalImpl{

    private final TerminalServer server;
    private final PinValidator pinValidator;

    public TerminalImpl() {
        this.server = new TerminalServer();
        this.pinValidator = new PinValidator();
    }

    public boolean checkPinCode() throws IncorrectPinException {
        boolean trig = false;
            String s = pinValidator.pin();
            String correctPas = server.getPassword();
            if (s.length() == correctPas.length()) {
                for (int i = 0; i < correctPas.length(); i++) {
                    if (s.charAt(i) == correctPas.charAt(i))
                        trig = true;
                    else {
                        trig = false;
                        throw new IncorrectPinException();
                    }
                }
            } else {
                trig = false;
                throw new IncorrectPinException();
            }
            return trig;
        }

    public int checkYourBill(){
        return server.checkAccount();
    }

    public void getMoneyFromAccount(int elem) throws NotEnoughMoneyException, AmountOfMoneyException {
        if ((server.checkAccount() >= elem) && (elem % 100 == 0))
            server.getMoney(elem);
        else if ((server.checkAccount() >= elem) && (elem % 100 != 0))
            throw new AmountOfMoneyException();
        else
            throw new NotEnoughMoneyException();
    }

    public void putMoneyOnTheBill(int elem) throws AmountOfMoneyException{
        if (elem % 100 == 0)
            server.putMoney(elem);
        else
            throw new AmountOfMoneyException();

    }
}
