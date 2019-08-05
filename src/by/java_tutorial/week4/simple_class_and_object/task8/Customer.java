package by.java_tutorial.week4.simple_class_and_object.task8;

public class Customer {

    private static int idCounter = 0;

    public Customer(String name, String surname, String patronymic, String address, String cardNumber,
                    String accountNumber) {
        this.setId(idCounter++);
        this.setName(name);
        this.setSurname(surname);
        this.setPatronymic(patronymic);
        this.setAddress(address);

        try {
            this.setCardNumber(cardNumber);
            this.setAccountNumber(accountNumber);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());

            this.cardNumber = null;
            this.accountNumber = null;

            System.out.println("Card number and account number haven't been set");
        }

    }

    private int id;

    private String name;
    private String surname;
    private String patronymic;

    private String address;

    private String cardNumber;
    private String accountNumber;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getPatronymic() {
        return patronymic;
    }
    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber)
            throws IllegalArgumentException
    {
        cardNumber = cardNumber.replaceAll("-", "");

        if (cardNumber.matches("\\d{16}")) {
            this.cardNumber = cardNumber;
        } else {
            this.cardNumber = null;
            throw new IllegalArgumentException("Invalid card number");
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber)
            throws IllegalArgumentException
    {
        if (accountNumber.matches("\\d{20}")) {
            this.accountNumber = accountNumber;
        } else {
            this.accountNumber = null;
            throw new IllegalArgumentException("Invalid account number");
        }
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", address='" + address + '\'' +
                ", cardNumber='" + cardNumber + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                '}';
    }
}
