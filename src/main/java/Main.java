import Accounts.*;

public class Main {
    public static void main (String[] args) {
        Account accountOne = new CheckingAccount("Расчетный счет", 60000);
        Account accountTwo = new CreditAccount("Кредитный счет", 0);
        Account accountThree = new SavingsAccount("Сберегательный счет", 230000);

        accountOne.addMoney(10000);
        accountOne.pay(80000);
        accountOne.transfer(accountThree, 40000);

        accountTwo.pay(96000);
        accountTwo.transfer(accountOne, 20000);
        accountTwo.addMoney(25000);

        accountThree.transfer(accountOne, 15000);
        accountThree.addMoney(25000);
        accountThree.pay(7000);

        accountOne.getBalance();
        accountTwo.getBalance();
        accountThree.getBalance();


        Account credit1 = new CreditAccount("Кредитный счет1", -100);

        Account credit2 = new CreditAccount("Кредитный счет2", -200);


        credit1.transfer(credit2, 1000); // Вы перевели 1000 на Кредитный счет2
        credit2.getBalance(); // 800

        Account accountFive = new CreditAccount("five", 600);
        accountFive.getBalance();
    }
}
