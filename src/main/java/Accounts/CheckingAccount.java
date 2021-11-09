package Accounts;

public class CheckingAccount extends Account {


    public CheckingAccount(String name, int money) {
        super(name, money);
    }

    @Override
    public String pay(int amount) {
        String s = null;
        if (amount <= money) {
            super.pay(amount);
            s = Integer.toString(money);
        } else {
            s= "Не хватает средств для платежа";
        }
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

