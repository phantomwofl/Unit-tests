package Accounts;

public class SavingsAccount extends Account{

    public SavingsAccount(String name, int money) {
        super(name, money);
    }

    @Override
    public String pay(int amount) {
        String s ="Счет не доступен для оплаты";
        return s;
    }

    @Override
    public String transfer(Account account, int amount) {
        String s = null;
        if (amount <= money) {
            super.transfer(account, amount);
            s = Integer.toString(money);
        } else {
            s = "Не хватает средств для перевода";
        }
        return s;
    }
}
