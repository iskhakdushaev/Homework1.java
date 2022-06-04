package lesson9;

class BankAccount {

    private long id;
    private String name = "Зеленый";
    private String string = new String("Красный");
    private long balance;


    public BankAccount() {


    }

    public BankAccount(long id, String name, long balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}

class TestBankAccount{
    public static void main(String[] args) {
        BankAccount myBankaccount = new BankAccount();
        BankAccount yourBankAccount = new BankAccount();
        BankAccount hisBankAccount = new BankAccount();

        myBankaccount.setBalance(300);
        myBankaccount.setId(1);
        myBankaccount.setName("Зеленый аккаунт");
        yourBankAccount = myBankaccount;
        int a = 10;
        int b = a;
        System.out.println(b);
        System.out.println("Ссылка на объект = " + myBankaccount);
        System.out.println(yourBankAccount);


    }
}
