package MyTerminal;

import java.util.*;


public class TestTerminal {
    public static void main(String[] args) throws AmountOfMoneyException, IncorrectPinException, NotEnoughMoneyException {

        Scanner in = new Scanner(System.in);
        TerminalImpl tem = new TerminalImpl();
        boolean trig = false;
        int pen = 4;
        int counter = 0;

                while (trig != true) {
                    try {
                        if (counter == 3) {
                            counter = 0;
                            try {
                                System.out.println("3 попытки истекли, подождите 5 сек");
                                Thread.sleep(5000);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                        else {
                            System.out.println("Здравствуйте, введите ваш пин код или 0 для выхода.");
                            trig = tem.checkPinCode();
                        }
                } catch(IncorrectPinException e){
                    System.out.println("Неправильный пароль.");
                    ++counter;
                }
            }
            while (pen != 0) {
            System.out.println("Введите номер желаемой операции : ");
            System.out.println("1 - узнать баланс счёта,");
            System.out.println("2 - снять желаемую сумму,");
            System.out.println("3 - положить желаемую сумму,");
            System.out.println("0 - для выхода.");

            pen = in.nextInt();

            switch (pen) {
                case 1: {
                    System.out.println(tem.checkYourBill());
                    break;
                }
                case 2: {
                    System.out.println("Введите сумму которую хотите снять: ");
                    int elem = in.nextInt();
                    try {
                        tem.getMoneyFromAccount(elem);
                    } catch (NotEnoughMoneyException e) {
                        System.out.println("Недостаточно денег на счете");
                    } catch (AmountOfMoneyException e) {
                        System.out.println("Сумма не кратна 100");
                    }
                    break;
                }
                case 3: {
                    System.out.println("Введите сумму которую хотите положить: ");
                    int elem = in.nextInt();
                    try {
                        tem.putMoneyOnTheBill(elem);
                    } catch (AmountOfMoneyException e) {
                        System.out.println("Сумма не кратна 100.");
                    }
                    break;
                }
                case 0:
                    break;
            }

        }
        System.out.println("Всего хорошего!");
    }
}
