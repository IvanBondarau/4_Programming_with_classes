package by.java_tutorial.week4.aggregation_and_composition.task4;

import java.util.ArrayList;
import java.util.Comparator;

public class Customer {
    ArrayList<Account> accounts;

    public Customer() {
        accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public Account find(String number) {
        for (var account: accounts) {
            if (account.getNumber().equals(number)) {
                return account;
            }
        }
        return null;
    }

    public static class AccountBalanceComparator implements Comparator<Account> {
        public int compare(Account a, Account b) {
            if (a.isBlocked() && b.isBlocked()) {
                return 0;
            }
            double balanceA;
            double balanceB;
            try {
                balanceA = a.getBalance();
            } catch (Exception e) {
                return -1;
            }
            try {
                balanceB = b.getBalance();
            } catch (Exception e) {
                return 1;
            }
            return Double.compare(balanceA, balanceB);
        }
    }

    public class AccountNumberComparator implements Comparator<Account> {
        public int compare(Account a, Account b) {
            return a.getNumber().compareTo(b.getNumber());
        }
    }

    public void sort(Comparator<Account> comparator) {
        accounts.sort(comparator);
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(ArrayList<Account> accounts) {
        this.accounts = accounts;
    }

    public double getSumOfAccountsWithPositiveBalance() {
        double sum = 0.d;
        try {
            for (var account : accounts) {
                if (!account.isBlocked() && account.getBalance() >= 0) {
                    sum += account.getBalance();
                }
            }
        } catch (Exception e) {}
        return sum;
    }

    public double getSumOfAccountsWithNegativeBalance() {
        double sum = 0.d;
        try {
            for (var account : accounts) {
                if (!account.isBlocked() && account.getBalance() <= 0) {
                    sum += account.getBalance();
                }
            }
        } catch (Exception e) {}
        return sum;
    }


    public double getSumOfAccounts() {
        double sum = 0.d;
        try {
            for (var account : accounts) {
                if (!account.isBlocked()) {
                    sum += account.getBalance();
                }
            }
        } catch (Exception e) {}
        return sum;
    }


}
