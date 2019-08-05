package by.java_tutorial.week4.aggregation_and_composition.task4;

public class Main {

    public static void main(String[] args) {
        Account account1 = new Account("AKC2F4");
        Account account2 = new Account("QR1DC2");
        Account account3 = new Account("Aaddad");

        account1.transfer(100);
        account2.transfer(-30);
        account3.transfer(194);
        account3.setBlocked();
        System.out.println(account2.transfer(-90) ? "Ok" : "Account 2 is blocked: transaction impossible");

        Customer testCustomer = new Customer();
        testCustomer.addAccount(account1);
        testCustomer.addAccount(account2);
        testCustomer.addAccount(account3);

        for (var account: testCustomer.getAccounts()) {
            System.out.println(account);
        }
        System.out.println();

        testCustomer.sort(new Customer.AccountBalanceComparator());

        for (var account: testCustomer.getAccounts()) {
            System.out.println(account);
        }
    }
}
