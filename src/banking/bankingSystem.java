package banking;

class bankingSystem implements BankOperation {
     AccountDetail accountHolder;
     int numberOfAccounts;

    public bankingSystem(AccountDetail accountHolder) {
        this.accountHolder = accountHolder;
        this.numberOfAccounts=0;
    }

    @Override
    public void accountDetail() {

    }

    @Override
    public int empty() {
        return 0;
    }

    @Override
    public int addAccount() {
        return 0;
    }
}
