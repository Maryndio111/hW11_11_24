public class BankAccount {
    private  Person owner;
    private String IBAN;
    public double balans;

    public BankAccount(Person owner) {
        this.owner = owner;
        this.IBAN = IBAN;
        this.balans = balans;
    }



    public Person getOwner() {
        return owner;
    }

    public String getIBAN() {
        return IBAN;
    }

    public double getBalans() {
        return balans;
    }
}
