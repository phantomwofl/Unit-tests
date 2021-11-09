package Accounts;

public class CreditAccount extends Account {

    public CreditAccount(String name, int money) {
        super(name, money);

        if (money > 0) {
            throw new RuntimeException("Вы не можете создать кредитный счет с положительным балансом!");
        }
    }

    @Override
    public void addMoney(int amount) {
        if ((money + amount) <= 0) {
            super.addMoney(amount);
        } else {
            System.out.println("Кредитный счет не может иметь положительный баланс!");
        }
    }

    @Override
    public void setMoney(int amount) {
        if ((money + amount) > 0) {
            throw new RuntimeException("Кредитный счет не может иметь положительный баланс!");
        }
        super.setMoney(amount);
    }
}