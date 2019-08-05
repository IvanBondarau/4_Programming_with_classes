package by.java_tutorial.week4.aggregation_and_composition.task4;

public class Account {

    private String number;
    private double balance;
    boolean blocked;

    Account(String number) {
        this.number = number;
        balance = 0d;
        blocked = false;
    }

    public double getBalance()
        throws Exception
    {
        if (!blocked) {
            return this.balance;
        } else {
            throw new Exception("Account is blocked");
        }

    }

    public boolean transfer(double amount) {

        if (!blocked) {
            this.balance += amount;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Account{" +
                "number='" + number + '\'' +
                ", blocked=" + blocked +
                (!blocked ? ", balance=" + balance : "") +
                '}';
    }

    public String getNumber() {
        return number;
    }

    public boolean isBlocked() {
        return blocked;
    }

    public void setBlocked() {
        blocked = true;
    }

    public void setUnlocked() {
        blocked = false;
    }




}
