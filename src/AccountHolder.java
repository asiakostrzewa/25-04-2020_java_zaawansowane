public class AccountHolder {

    private String name;

    private Account account;

    public AccountHolder(String name, Account account) {
        this.name = name;
        this.account = account;
    }

    public int withdraw(int value) {
        return account.withdraw(value);
    }

    public String getName() {
        return name;
    }
}
