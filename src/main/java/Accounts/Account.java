package Accounts;

public abstract class Account {
    int money;
    String name;

    public Account(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public String pay(int amount) {
        money -= amount;
        String s = Integer.toString(money);
        System.out.println("Вы заплатили " + amount);
        return s;
    }

    public String transfer(Account account, int amount){
            money -= amount;
            account.setMoney(amount);
            String s = ("Вы перевели " + amount + " на " + account.name);
            return s;
    }

    public void addMoney(int amount) {
        setMoney(amount);
        System.out.println("На счет добавлено " + amount);
    }

    public void getBalance() {
        System.out.println(money);
    }

    public void setMoney(int amount) {
        this.money += amount;
    }

}

