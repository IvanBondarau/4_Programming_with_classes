package by.java_tutorial.week4.simple_class_and_object.task8;

import java.util.Comparator;
import java.util.Scanner;

public class Main {

	private static Scanner in;

	private static String getCardNumber() {
		String cardNumber;
		boolean cardNumberOk = false;
		do {
			System.out.print("Card number:");
			cardNumber = in.nextLine();
			cardNumber = cardNumber.replaceAll("-","");
			System.out.println(cardNumber);
			if (cardNumber.matches("\\d{16}")) {
				cardNumberOk = true;
			} else {
				System.out.println("Error, invalid card number");
			}
		} while (!cardNumberOk);

		return cardNumber;
	}

	private static String getBankAccount() {
		boolean bankAccountOk = false;
		String bankAccount;
		do {
			System.out.print("Bank account number: ");
			bankAccount = in.nextLine();
			if (bankAccount.matches("\\d{20}")) {
				bankAccountOk = true;
			} else {
				System.out.println("Error, invalid bank account number");
			}
		} while (!bankAccountOk);

		return bankAccount;
	}

	private static Customer getCustomer() {

		System.out.println("Enter new customer data:");
		System.out.print("Name: ");
		String name = in.nextLine();
		System.out.print("Surname: ");
		String surname = in.nextLine();
		System.out.print("Patronymic: ");
		String patronymic = in.nextLine();
		System.out.print("Address: ");
		String address = in.nextLine();

		String cardNumber = getCardNumber();
		String bankAccount = getBankAccount();

		Customer ans = new Customer(name, surname, patronymic, address, cardNumber, bankAccount);

		return ans;
	}

	public static void main(String[] args)  {

		in = new Scanner(System.in);

		System.out.println("Enter number of customers");
		int customersNum = in.nextInt();
		in.nextLine();

		CustomerArray customers = new CustomerArray(customersNum);

		for (int i = 0; i < customers.length(); i++) {
			System.out.println("Customer " + (i + 1));
			customers.set(i, getCustomer());

			System.out.println(customers.get(i));
		}

		customers.sort(new Comparator<Customer> (){
			public int compare(Customer a, Customer b) {
				int names = a.getName().compareTo(b.getName());
				int surnames = a.getSurname().compareTo(b.getSurname());
				int patronymics = a.getPatronymic().compareTo(b.getPatronymic());
				return (surnames != 0 ? surnames : names != 0 ? names : patronymics);
			}
		});

		for (int i = 0; i < customers.length(); i++) {
			Customer curCustomer = customers.get(i);
			System.out.println(curCustomer.getSurname() + " " +
					curCustomer.getName() + " " +
					curCustomer.getPatronymic());
		}

		System.out.println("Enter 2 card numbers: ");
		String cardNumber1 = getCardNumber();
		String cardNumber2 = getCardNumber();

		for (int i = 0; i < customers.length(); i++) {
			if (customers.get(i).getCardNumber().compareTo(cardNumber1) >= 0 &&
					customers.get(i).getCardNumber().compareTo(cardNumber2) <= 0) {
				System.out.println(customers.get(i));
			}
		}

	}

}
